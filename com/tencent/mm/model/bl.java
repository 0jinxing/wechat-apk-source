package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

public final class bl
{
  public int bJt;
  public String fjx;
  public String fjz;
  public String fmX;
  public String fmY;
  public String fmZ;
  public long fna;
  public String fnb;
  public String fnc;
  public int fnd;
  public int fne;
  public long fnf;
  public String fng;
  public String fnh;
  public String name;
  public long time;
  public String title;
  public int type;
  public String url;

  public bl()
  {
    AppMethodBeat.i(108667);
    this.bJt = -1;
    this.fmX = "";
    this.time = 0L;
    this.type = 0;
    this.name = "";
    this.title = "";
    this.url = "";
    this.fmY = "";
    this.fmZ = "";
    this.fna = 0L;
    this.fnb = "";
    this.fnc = "";
    this.fnd = 0;
    this.fjx = "";
    this.fjz = "";
    this.fne = 0;
    this.fnf = 0L;
    this.fng = "";
    this.fnh = "";
    AppMethodBeat.o(108667);
  }

  public static String kG(int paramInt)
  {
    AppMethodBeat.i(108669);
    String str;
    if (paramInt == 20)
    {
      str = "newsapp";
      AppMethodBeat.o(108669);
    }
    while (true)
    {
      return str;
      if (paramInt == 11)
      {
        str = "blogapp";
        AppMethodBeat.o(108669);
      }
      else
      {
        Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
        str = null;
        AppMethodBeat.o(108669);
      }
    }
  }

  public final boolean aai()
  {
    boolean bool = true;
    if (this.fne == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final String aaj()
  {
    if (this.fmX == null);
    for (String str = ""; ; str = this.fmX)
      return str;
  }

  public final String aak()
  {
    if (this.fmY == null);
    for (String str = ""; ; str = this.fmY)
      return str;
  }

  public final String aal()
  {
    if (this.fnb == null);
    for (String str = ""; ; str = this.fnb)
      return str;
  }

  public final String aam()
  {
    if (this.fnc == null);
    for (String str = ""; ; str = this.fnc)
      return str;
  }

  public final String aan()
  {
    AppMethodBeat.i(108670);
    Object localObject;
    if (this.fjx != null)
    {
      localObject = this.fjx.split("\\|");
      if ((localObject != null) && (localObject.length > 0))
      {
        localObject = localObject[0];
        AppMethodBeat.o(108670);
      }
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(108670);
      continue;
      localObject = "";
      AppMethodBeat.o(108670);
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(108668);
    this.fmX = paramCursor.getString(0);
    this.time = paramCursor.getLong(1);
    this.type = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.title = paramCursor.getString(4);
    this.url = paramCursor.getString(5);
    this.fmY = paramCursor.getString(6);
    this.fmZ = paramCursor.getString(7);
    this.fna = paramCursor.getLong(8);
    this.fnb = paramCursor.getString(9);
    this.fnc = paramCursor.getString(10);
    this.fnd = paramCursor.getInt(11);
    this.fjx = paramCursor.getString(12);
    this.fjz = paramCursor.getString(13);
    this.fne = paramCursor.getInt(14);
    this.fnf = paramCursor.getLong(15);
    this.fng = paramCursor.getString(16);
    this.fnh = paramCursor.getString(17);
    AppMethodBeat.o(108668);
  }

  public final String getDigest()
  {
    if (this.fjz == null);
    for (String str = ""; ; str = this.fjz)
      return str;
  }

  public final String getName()
  {
    if (this.name == null);
    for (String str = ""; ; str = this.name)
      return str;
  }

  public final String getTitle()
  {
    if (this.title == null);
    for (String str = ""; ; str = this.title)
      return str;
  }

  public final String getUrl()
  {
    if (this.url == null);
    for (String str = ""; ; str = this.url)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bl
 * JD-Core Version:    0.6.2
 */