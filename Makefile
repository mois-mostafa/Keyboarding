JPATH = src/keyboarding/
CPATH = classes/keyboarding/
JFLAGS = -g -d classes -cp classes
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
	$(JVM) -cp classes keyboarding.Keyboarding

classes: $(CLASSES:.java=.class)

clean:
	$(RM) $(CPATH)*.class
