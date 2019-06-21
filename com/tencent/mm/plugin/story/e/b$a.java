package com.tencent.mm.plugin.story.e;

import a.f.b.j;
import a.k.m;
import a.l;
import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/data/StoryTimeUtil$Companion;", "", "()V", "MILLSECONDS_OF_DAY", "", "getMILLSECONDS_OF_DAY", "()J", "MILLSECONDS_OF_HOUR", "getMILLSECONDS_OF_HOUR", "MILLSECONDS_OF_MINUTE", "getMILLSECONDS_OF_MINUTE", "MILLSECONDS_OF_SECOND", "getMILLSECONDS_OF_SECOND", "TAG", "", "formatDateInGallery", "", "date", "formatDateInGrid", "formatDateToTimeSecond", "", "formatStoryCreateDate", "time", "formatTimeInGrid", "formatTimeSecondToDate", "(Ljava/lang/Integer;)Ljava/lang/String;", "formatTimeSecondToMD", "nowToYear", "plugin-story_release"})
public final class b$a
{
  public static CharSequence aaf(String paramString)
  {
    AppMethodBeat.i(108988);
    j.p(paramString, "date");
    try
    {
      paramString = m.a((CharSequence)paramString, new String[] { "-" });
      int i = Integer.parseInt((String)paramString.get(0));
      int j = Integer.parseInt((String)paramString.get(1));
      int k = Integer.parseInt((String)paramString.get(2));
      paramString = new java/util/GregorianCalendar;
      paramString.<init>(i, j - 1, k);
      l = paramString.getTimeInMillis();
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      paramString = new GregorianCalendar();
      paramString.setTimeInMillis(l);
      if ((localGregorianCalendar.get(1) == paramString.get(1)) && (localGregorianCalendar.get(2) == paramString.get(2)))
      {
        paramString = ah.getContext().getString(2131303909);
        j.o(paramString, "MMApplicationContext.get…ry_album_date_this_month)");
        paramString = (CharSequence)paramString;
        AppMethodBeat.o(108988);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace(b.access$getTAG$cp(), (Throwable)paramString, paramString.getMessage(), new Object[0]);
        long l = 0L;
        continue;
        new GregorianCalendar().setTimeInMillis(l);
        paramString = DateFormat.format((CharSequence)ah.getContext().getString(2131303908), l);
        j.o(paramString, "DateFormat.format(MMAppl…_album_date_split), time)");
        AppMethodBeat.o(108988);
      }
    }
  }

  public static CharSequence aag(String paramString)
  {
    AppMethodBeat.i(138746);
    j.p(paramString, "date");
    try
    {
      paramString = m.a((CharSequence)paramString, new String[] { "-" });
      int i = Integer.parseInt((String)paramString.get(0));
      int j = Integer.parseInt((String)paramString.get(1));
      int k = Integer.parseInt((String)paramString.get(2));
      paramString = new java/util/GregorianCalendar;
      paramString.<init>(i, j - 1, k);
      l = paramString.getTimeInMillis();
      paramString = DateFormat.format((CharSequence)ah.getContext().getString(2131306018), l);
      j.o(paramString, "DateFormat.format(MMAppl…allery_date_split), time)");
      AppMethodBeat.o(138746);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace(b.access$getTAG$cp(), (Throwable)paramString, paramString.getMessage(), new Object[0]);
        long l = 0L;
      }
    }
  }

  public static int aah(String paramString)
  {
    AppMethodBeat.i(108990);
    j.p(paramString, "date");
    paramString = new SimpleDateFormat("yyyy-MM-dd").parse(paramString);
    j.o(paramString, "simpleDateFormat.parse(date)");
    int i = (int)(paramString.getTime() / 1000L);
    AppMethodBeat.o(108990);
    return i;
  }

  public static String j(Integer paramInteger)
  {
    AppMethodBeat.i(108991);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    if (paramInteger != null);
    for (long l = paramInteger.intValue(); ; l = 0L)
    {
      paramInteger = localSimpleDateFormat.format(new Date(l * 1000L));
      j.o(paramInteger, "simpleDateFormat.format(date)");
      AppMethodBeat.o(108991);
      return paramInteger;
    }
  }

  public static int kX(long paramLong)
  {
    AppMethodBeat.i(108989);
    try
    {
      i = Integer.parseInt(DateFormat.format((CharSequence)ah.getContext().getString(2131303907), paramLong).toString());
      AppMethodBeat.o(108989);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        ab.printErrStackTrace(b.access$getTAG$cp(), (Throwable)localNumberFormatException, "NumberFormatException", new Object[0]);
        int i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.e.b.a
 * JD-Core Version:    0.6.2
 */