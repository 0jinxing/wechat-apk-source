package com.tencent.mm.pluginsdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class c$a
{
  public static final HashMap<String, Long> vak;

  static
  {
    AppMethodBeat.i(114653);
    HashMap localHashMap = new HashMap();
    vak = localHashMap;
    localHashMap.put("doc", Long.valueOf(64L));
    vak.put("docx", Long.valueOf(128L));
    vak.put("ppt", Long.valueOf(256L));
    vak.put("pptx", Long.valueOf(512L));
    vak.put("xls", Long.valueOf(1024L));
    vak.put("xlsx", Long.valueOf(2048L));
    vak.put("pdf", Long.valueOf(4096L));
    vak.put("1", Long.valueOf(1L));
    vak.put("3", Long.valueOf(2L));
    vak.put("48", Long.valueOf(4L));
    vak.put("43", Long.valueOf(8L));
    vak.put("mp3", Long.valueOf(16L));
    vak.put("wav", Long.valueOf(16L));
    vak.put("wma", Long.valueOf(16L));
    vak.put("avi", Long.valueOf(8L));
    vak.put("rmvb", Long.valueOf(8L));
    vak.put("rm", Long.valueOf(8L));
    vak.put("mpg", Long.valueOf(8L));
    vak.put("mpeg", Long.valueOf(8L));
    vak.put("wmv", Long.valueOf(8L));
    vak.put("mp4", Long.valueOf(8L));
    vak.put("mkv", Long.valueOf(8L));
    AppMethodBeat.o(114653);
  }

  public static Long aik(String paramString)
  {
    AppMethodBeat.i(114652);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(114652);
    }
    while (true)
    {
      return paramString;
      paramString = (Long)vak.get(paramString.toLowerCase());
      AppMethodBeat.o(114652);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.a
 * JD-Core Version:    0.6.2
 */