package com.tencent.mm.plugin.music.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  private String album;
  private String hAf;
  private int lWS;
  public ArrayList<a.a> oMj;
  private LinkedList<Long> oMk;
  private String oMl;
  private String oMm;
  private String oMn;
  private boolean oMo;
  private String title;
  private long xb;

  private a()
  {
    AppMethodBeat.i(104875);
    this.oMk = new LinkedList();
    this.oMj = new ArrayList();
    this.lWS = 0;
    this.oMo = false;
    AppMethodBeat.o(104875);
  }

  private static long Tj(String paramString)
  {
    AppMethodBeat.i(104873);
    try
    {
      paramString = paramString.split(":");
      int i = d.la(paramString[0]);
      if (paramString.length > 1)
      {
        paramString = paramString[1].split("\\.");
        j = d.la(paramString[0]);
        if (paramString.length > 1)
        {
          k = d.la(paramString[1]);
          long l1 = i;
          l2 = j * 1000;
          l2 = k * 10 + (l2 + l1 * 60L * 1000L);
          AppMethodBeat.o(104873);
          return l2;
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.LyricObj", paramString, "", new Object[0]);
        ab.w("MicroMsg.Music.LyricObj", "strToLong error: %s", new Object[] { paramString.getLocalizedMessage() });
        long l2 = 0L;
        AppMethodBeat.o(104873);
        continue;
        int k = 0;
        continue;
        k = 0;
        int j = 0;
      }
    }
  }

  public static a a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2)
  {
    AppMethodBeat.i(104871);
    a locala = new a();
    long l = bo.yz();
    if (!bo.isNullOrNil(paramString1))
      if (paramString1 == null)
      {
        ab.w("MicroMsg.Music.LyricObj", "parserLrc: but lrc or lrcMgr is null");
        ab.d("MicroMsg.Music.LyricObj", "getLrcMgr beg: src lrc = %s", new Object[] { paramString1 });
        ab.d("MicroMsg.Music.LyricObj", "parse finish: sentence size [%d], result:", new Object[] { Integer.valueOf(locala.oMj.size()) });
        label77: if (!bo.isNullOrNil(paramString3))
          break label980;
        ab.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
        label91: if (!bo.isNullOrNil(paramString1))
        {
          if (!bo.isNullOrNil(paramString2))
            break label1139;
          ab.w("MicroMsg.Music.LyricObj", "add lyric prefix: but prefix is empty, return");
        }
      }
    while (true)
    {
      ab.d("MicroMsg.Music.LyricObj", "getLrcMgr finish: use %d ms", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(104871);
      return locala;
      paramString4 = paramString1.replaceAll("\n", " ").replaceAll("\r", " ");
      Matcher localMatcher1 = Pattern.compile("(\\[((\\d{2}:\\d{2}(\\.\\d{2}){0,1}\\])|(al:|ar:|by:|offset:|re:|ti:|ve:))[^\\[]*)").matcher(paramString4);
      while (localMatcher1.find())
      {
        String str = localMatcher1.group();
        localMatcher1.start();
        localMatcher1.end();
        if (str == null)
        {
          ab.w("MicroMsg.Music.LyricObj", "parserLine fail: lrcMgr or str is null");
        }
        else if (str.startsWith("[ti:"))
        {
          locala.title = fp(str, "[ti:");
        }
        else if (str.startsWith("[ar:"))
        {
          locala.hAf = fp(str, "[ar:");
        }
        else if (str.startsWith("[al:"))
        {
          locala.album = fp(str, "[al:");
        }
        else if (str.startsWith("[by:"))
        {
          locala.oMl = fp(str, "[by:");
        }
        else if (str.startsWith("[offset:"))
        {
          locala.xb = bo.getLong(fp(str, "[offset:"), 0L);
        }
        else if (str.startsWith("[re:"))
        {
          locala.oMm = fp(str, "[re:");
        }
        else if (str.startsWith("[ve:"))
        {
          locala.oMn = fp(str, "[ve:");
        }
        else
        {
          Pattern localPattern = Pattern.compile("\\[(\\d{2}:\\d{2}(\\.\\d{2}){0,1})\\]");
          Matcher localMatcher2 = localPattern.matcher(str);
          a.a locala1 = new a.a();
          label417: if (localMatcher2.find())
          {
            if (localMatcher2.groupCount() > 0)
              locala1.timestamp = Tj(localMatcher2.group(1));
            paramString4 = localPattern.split(str);
            if ((paramString4 != null) && (paramString4.length > 0))
            {
              localObject = paramString4[(paramString4.length - 1)];
              paramString4 = (String)localObject;
              if (localObject != null)
                paramString4 = ((String)localObject).trim();
              localObject = paramString4;
              if (bo.isNullOrNil(paramString4))
                localObject = " ";
              locala1.content = ((String)localObject);
              i = 0;
            }
            while (true)
              if (i < locala.oMk.size())
              {
                paramString4 = new a.a();
                paramString4.timestamp = ((Long)locala.oMk.get(i)).longValue();
                paramString4.content = locala1.content;
                paramString4.oMp = true;
                i++;
                continue;
                locala.oMk.add(Long.valueOf(locala1.timestamp));
                break;
              }
            locala.oMk.clear();
          }
          for (i = locala.oMj.size() - 1; ; i--)
            if ((i >= 0) && (((a.a)locala.oMj.get(i)).timestamp != locala1.timestamp))
            {
              if (((a.a)locala.oMj.get(i)).timestamp < locala1.timestamp)
                locala.oMj.add(i + 1, locala1);
            }
            else
            {
              if (i >= 0)
                break label417;
              locala.oMj.add(0, locala1);
              break label417;
              break;
            }
        }
      }
      ab.d("MicroMsg.Music.LyricObj", "handle offset %d", new Object[] { Long.valueOf(locala.xb) });
      if (locala.xb != 0L)
      {
        for (i = 0; i < locala.oMj.size(); i++)
        {
          paramString4 = (a.a)locala.oMj.get(i);
          paramString4.timestamp += locala.xb;
        }
        locala.xb = 0L;
      }
      for (int i = 0; i < locala.oMj.size() - 1; i++)
      {
        paramString4 = (a.a)locala.oMj.get(i);
        if ((paramString4.oMp) && (paramString4.content.equals(((a.a)locala.oMj.get(i + 1)).content)))
          paramString4.content = " ";
      }
      break;
      Object localObject = new a.a();
      ((a.a)localObject).timestamp = 0L;
      if (paramBoolean2)
        ((a.a)localObject).content = paramString4;
      while (true)
      {
        if (((a.a)localObject).content == null)
          break label978;
        locala.oMj.add(localObject);
        break;
        if (!paramBoolean1)
          ((a.a)localObject).content = ah.getContext().getString(2131301727);
        else
          ((a.a)localObject).content = ah.getContext().getString(2131301728);
      }
      label978: break label77;
      label980: paramString4 = new a.a();
      paramString4.timestamp = 0L;
      paramString4.content = ah.getContext().getString(2131304198, new Object[] { s.mJ(paramString3) });
      if (locala.oMj.isEmpty())
      {
        locala.oMj.add(paramString4);
        break label91;
      }
      if (locala.oMj.size() == 1)
      {
        locala.oMj.add(0, paramString4);
        ((a.a)locala.oMj.get(1)).timestamp = 5000L;
        break label91;
      }
      locala.oMj.add(0, paramString4);
      ((a.a)locala.oMj.get(1)).timestamp = (3L * (((a.a)locala.oMj.get(2)).timestamp >> 2));
      break label91;
      label1139: paramString1 = new a.a();
      paramString1.timestamp = 0L;
      paramString1.content = paramString2;
      if (locala.oMj.isEmpty())
      {
        locala.oMj.add(paramString1);
      }
      else if (locala.oMj.size() == 1)
      {
        locala.oMj.add(0, paramString1);
        ((a.a)locala.oMj.get(1)).timestamp = 5000L;
      }
      else
      {
        locala.oMj.add(0, paramString1);
        ((a.a)locala.oMj.get(1)).timestamp = (3L * (((a.a)locala.oMj.get(2)).timestamp >> 2));
      }
    }
  }

  private static String fp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(104872);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
      AppMethodBeat.o(104872);
    while (true)
    {
      return paramString1;
      if (paramString2.length() >= paramString1.length() - 1)
      {
        paramString1 = "";
        AppMethodBeat.o(104872);
      }
      else
      {
        String str = paramString1.substring(paramString2.length(), paramString1.length() - 1);
        ab.d("MicroMsg.Music.LyricObj", "str[%s] prefix[%s] attr[%s]", new Object[] { paramString1, paramString2, str });
        AppMethodBeat.o(104872);
        paramString1 = str;
      }
    }
  }

  public final a.a zJ(int paramInt)
  {
    AppMethodBeat.i(104874);
    a.a locala;
    if ((paramInt < 0) || (paramInt >= this.oMj.size()))
    {
      locala = null;
      AppMethodBeat.o(104874);
    }
    while (true)
    {
      return locala;
      locala = (a.a)this.oMj.get(paramInt);
      AppMethodBeat.o(104874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a
 * JD-Core Version:    0.6.2
 */