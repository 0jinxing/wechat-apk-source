package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/xml/ResourceFileConfig;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "ResouceFileVersion", "", "getResouceFileVersion", "()I", "setResouceFileVersion", "(I)V", "fileList", "Ljava/util/LinkedList;", "", "getFileList", "()Ljava/util/LinkedList;", "parseTag", "", "tag", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "plugin-emojicapture_release"})
public final class i extends a
{
  public int ljI;
  private final LinkedList<String> ljJ;

  public i()
  {
    AppMethodBeat.i(2733);
    this.ljJ = new LinkedList();
    AppMethodBeat.o(2733);
  }

  protected final void a(String paramString, XmlPullParser paramXmlPullParser)
  {
    AppMethodBeat.i(2732);
    j.p(paramString, "tag");
    j.p(paramXmlPullParser, "parser");
    switch (paramString.hashCode())
    {
    default:
    case 2115186004:
    }
    while (true)
    {
      a(paramXmlPullParser);
      AppMethodBeat.o(2732);
      while (true)
      {
        return;
        if (!paramString.equals("ResouceFileVersion"))
          break;
        this.ljI = e(paramXmlPullParser);
        AppMethodBeat.o(2732);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.c.i
 * JD-Core Version:    0.6.2
 */