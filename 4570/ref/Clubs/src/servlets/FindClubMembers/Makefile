#############################################################
##
##  File:  Makefile
##
##  Makefile for the FindClubMembers servlet
##
##


include		../../../Makefile.glob


##
## Servlet source files
##
SERVLET_SRCS	= FindClubMembers.java \
		  FindClubMembersClubsList.java


##
## Servlet class files
##
SERVLET_CLASSES	= $(CLASSESDIR)/FindClubMembers.class \
		  $(CLASSESDIR)/FindClubMembersClubsList.class


##
## Servlet template files
##
SERVLET_TMPLS	= FindClubMembers-Result.ftl \
		  FindClubMembersClubsList-Result.ftl


##
## Servlet HTML files
##
SERVLET_HTMLS	= FindClubMembers.html


##
## Targets
##
all:
	@echo Select a proper target

build: $(LIBDIR)/clubs.jar $(SERVLET_CLASSES)

$(SERVLET_CLASSES): $(SERVLET_SRCS)
	$(JAVAC) -d $(CLASSESDIR) -classpath $(CLASSESDIR):$(LIBDIR)/clubs.jar:$(JDBC_JAR):$(J2EE_JAR):$(FREEMARKER_JAR) $(SERVLET_SRCS)


install: $(SERVLET_CLASSES)
	$(foreach class, $(SERVLET_CLASSES), $(INSTALL) -f $(INST_CLASSESDIR) -m 644 $(class);)
	$(foreach html, $(SERVLET_HTMLS), $(INSTALL) -f $(INST_WWWDIR) -m 644 $(html);)
	$(foreach templ, $(SERVLET_TMPLS), $(INSTALL) -f $(INST_TEMPLDIR) -m 644 $(templ);)

clean:
	$(RM) -f $(SERVLET_CLASSES)

realclean: clean
	cd $(INST_CLASSESDIR); $(foreach class, $(SERVLET_CLASSES), $(RM) -f $(notdir $(class));)
	cd $(INST_WWWDIR); $(foreach html, $(SERVLET_HTMLS), $(RM) -f $(notdir $(html));)
	cd $(INST_TEMPLDIR); $(foreach templ, $(SERVLET_TMPLS), $(RM) -f $(notdir $(templ));)
