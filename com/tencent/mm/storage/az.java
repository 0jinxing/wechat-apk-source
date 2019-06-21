package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class az
{
  public static final az xYM;
  public static final az xYN;
  public static final az xYO;
  public static final az xYP;
  public static final az xYQ;
  public static final az xYR;
  public static final az xYS;
  public static final az xYT;
  public static final az xYU;
  public static final az xYV;
  public static final az xYW;
  public static final az xYX;
  public static final az xYY;
  public int oyB = 0;
  public String tag = "";

  static
  {
    AppMethodBeat.i(59006);
    xYM = new az("timeline");
    xYN = new az("album_friend");
    xYO = new az("album_self");
    xYP = new az("album_stranger");
    xYQ = new az("profile_friend");
    xYR = new az("profile_stranger");
    xYS = new az("comment");
    xYT = new az("comment_detail");
    xYU = new az("other");
    xYV = new az("snssight");
    xYW = new az("fts");
    xYX = new az("storysight");
    xYY = new az("storyalbum");
    AppMethodBeat.o(59006);
  }

  public az(String paramString)
  {
    this.tag = paramString;
  }

  public static az a(az paramaz, int paramInt)
  {
    AppMethodBeat.i(59003);
    paramaz = new az(paramaz.tag);
    paramaz.oyB = paramInt;
    AppMethodBeat.o(59003);
    return paramaz;
  }

  public static az dtg()
  {
    AppMethodBeat.i(58996);
    az localaz = new az("timeline");
    AppMethodBeat.o(58996);
    return localaz;
  }

  public static az dth()
  {
    AppMethodBeat.i(58997);
    az localaz = new az("album_friend");
    AppMethodBeat.o(58997);
    return localaz;
  }

  public static az dti()
  {
    AppMethodBeat.i(58998);
    az localaz = new az("album_self");
    AppMethodBeat.o(58998);
    return localaz;
  }

  public static az dtj()
  {
    AppMethodBeat.i(58999);
    az localaz = new az("album_stranger");
    AppMethodBeat.o(58999);
    return localaz;
  }

  public static az dtk()
  {
    AppMethodBeat.i(59000);
    az localaz = new az("comment_detail");
    AppMethodBeat.o(59000);
    return localaz;
  }

  public static az dtl()
  {
    AppMethodBeat.i(59001);
    az localaz = new az("snssight");
    AppMethodBeat.o(59001);
    return localaz;
  }

  public static az dtm()
  {
    AppMethodBeat.i(59002);
    az localaz = new az("storysight");
    AppMethodBeat.o(59002);
    return localaz;
  }

  public final az Mp(int paramInt)
  {
    this.oyB = paramInt;
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(59004);
    boolean bool;
    if ((paramObject instanceof az))
    {
      bool = ((az)paramObject).tag.equals(this.tag);
      AppMethodBeat.o(59004);
    }
    while (true)
    {
      return bool;
      bool = super.equals(paramObject);
      AppMethodBeat.o(59004);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(59005);
    String str = this.tag + "@" + this.oyB;
    AppMethodBeat.o(59005);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.az
 * JD-Core Version:    0.6.2
 */