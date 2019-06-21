package com.tencent.mm.storage.emotion;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends j<b>
  implements g.a
{
  public static final String[] fnj;
  public e bSd;
  public SharedPreferences yaX;

  static
  {
    AppMethodBeat.i(62800);
    fnj = new String[] { j.a(b.ccO, "EmojiInfoDesc") };
    AppMethodBeat.o(62800);
  }

  public c(e parame)
  {
    this(parame, b.ccO, "EmojiInfoDesc");
  }

  private c(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    AppMethodBeat.i(62794);
    this.bSd = parame;
    this.yaX = PreferenceManager.getDefaultSharedPreferences(ah.getContext());
    AppMethodBeat.o(62794);
  }

  public final String Jh(String paramString)
  {
    AppMethodBeat.i(62795);
    String str1 = null;
    String str2 = String.format("select %s from %s where %s=?", new Object[] { "desc", "EmojiInfoDesc", "md5_lang" });
    Object localObject = paramString + aa.dor().toLowerCase();
    localObject = this.bSd.a(str2, new String[] { localObject }, 2);
    if (((Cursor)localObject).moveToFirst())
      str1 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("desc"));
    ((Cursor)localObject).close();
    if (!bo.isNullOrNil(str1))
      AppMethodBeat.o(62795);
    while (true)
    {
      return str1;
      paramString = paramString + "default";
      paramString = this.bSd.a(str2, new String[] { paramString }, 2);
      if (paramString.moveToFirst())
        str1 = paramString.getString(paramString.getColumnIndex("desc"));
      paramString.close();
      AppMethodBeat.o(62795);
    }
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean aqf(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = false;
    AppMethodBeat.i(62796);
    String str1 = String.format("select %s from %s where %s=?", new Object[] { "click_flag", "EmojiInfoDesc", "groupId" });
    Object localObject = null;
    String str2 = null;
    try
    {
      paramString = this.bSd.a(str1, new String[] { paramString }, 2);
      boolean bool4 = bool3;
      if (paramString != null)
      {
        bool4 = bool3;
        str2 = paramString;
        localObject = paramString;
        if (paramString.moveToFirst())
        {
          str2 = paramString;
          localObject = paramString;
          int i = paramString.getInt(paramString.getColumnIndex("click_flag"));
          if ((i & 0x1) != 1)
            break label151;
        }
      }
      label151: for (bool4 = bool1; ; bool4 = false)
      {
        bool3 = bool4;
        if (paramString != null)
        {
          paramString.close();
          bool3 = bool4;
        }
        AppMethodBeat.o(62796);
        return bool3;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        localObject = str2;
        ab.w("MicroMsg.emoji.EmojiInfoDescStorage", "[isPurChase] Exception:%s", new Object[] { paramString.toString() });
        bool3 = bool2;
        if (str2 != null)
        {
          str2.close();
          bool3 = bool2;
        }
      }
    }
    finally
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(62796);
    }
    throw paramString;
  }

  public final boolean aqg(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = false;
    AppMethodBeat.i(62797);
    String str1 = String.format("select %s from %s where %s=?", new Object[] { "download_flag", "EmojiInfoDesc", "groupId" });
    Object localObject = null;
    String str2 = null;
    try
    {
      paramString = this.bSd.a(str1, new String[] { paramString }, 2);
      boolean bool4 = bool3;
      if (paramString != null)
      {
        bool4 = bool3;
        str2 = paramString;
        localObject = paramString;
        if (paramString.moveToFirst())
        {
          str2 = paramString;
          localObject = paramString;
          int i = paramString.getInt(paramString.getColumnIndex("download_flag"));
          if ((i & 0x1) != 1)
            break label151;
        }
      }
      label151: for (bool4 = bool1; ; bool4 = false)
      {
        bool3 = bool4;
        if (paramString != null)
        {
          paramString.close();
          bool3 = bool4;
        }
        AppMethodBeat.o(62797);
        return bool3;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        localObject = str2;
        ab.w("MicroMsg.emoji.EmojiInfoDescStorage", "[isPurChase] Exception:%s", new Object[] { paramString.toString() });
        bool3 = bool2;
        if (str2 != null)
        {
          str2.close();
          bool3 = bool2;
        }
      }
    }
    finally
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(62797);
    }
    throw paramString;
  }

  public final boolean aqh(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(62798);
    boolean bool3 = bool1;
    String str1;
    Object localObject;
    String str2;
    if (com.tencent.mm.plugin.emoji.h.b.JX(paramString))
    {
      str1 = String.format("select %s from %s where %s=?", new Object[] { "desc", "EmojiInfoDesc", "groupId" });
      localObject = null;
      str2 = null;
    }
    try
    {
      paramString = this.bSd.a(str1, new String[] { paramString }, 2);
      boolean bool4 = bool2;
      if (paramString != null)
      {
        str2 = paramString;
        localObject = paramString;
        bool3 = paramString.moveToFirst();
        bool4 = bool2;
        if (bool3)
          bool4 = true;
      }
      bool3 = bool4;
      if (paramString != null)
      {
        paramString.close();
        bool3 = bool4;
      }
      AppMethodBeat.o(62798);
      return bool3;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        localObject = str2;
        ab.w("MicroMsg.emoji.EmojiInfoDescStorage", paramString.toString());
        bool3 = bool1;
        if (str2 != null)
        {
          str2.close();
          bool3 = bool1;
        }
      }
    }
    finally
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(62798);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.c
 * JD-Core Version:    0.6.2
 */