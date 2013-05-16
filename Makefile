JPATH = src/keyboarding/
CPATH = build/keyboarding/
JFLAGS = -g -d build -cp classes
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $(JPATH)*.java

CLASSES = \
  $(JPATH)Keyboarding.java \
  $(JPATH)KeyboardingManifest.java \
  $(JPATH)KeyboardLayoutFrame.java

MAIN = Main

default: classes

run: classes
	$(JVM) -cp build keyboarding.Keyboarding

classes: $(CLASSES:.java=.class)

clean:
	$(RM) $(CPATH)*.class
