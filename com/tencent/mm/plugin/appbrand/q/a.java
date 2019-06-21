package com.tencent.mm.plugin.appbrand.q;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends j<a>
{
  public static final String[] fjY;

  static
  {
    AppMethodBeat.i(132776);
    fjY = new String[] { j.a(a.gSs, "AppBrandCommonKVBinaryData") };
    AppMethodBeat.o(132776);
  }

  public a(e parame)
  {
    super(parame, a.gSs, "AppBrandCommonKVBinaryData", null);
  }

  public final byte[] DH(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(132774);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(132774);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      a locala = new a();
      locala.field_key = paramString;
      if (super.b(locala, new String[0]))
      {
        paramString = locala.field_value;
        AppMethodBeat.o(132774);
      }
      else
      {
        AppMethodBeat.o(132774);
        paramString = localObject;
      }
    }
  }

  public final void clear(String paramString)
  {
    AppMethodBeat.i(132772);
    a locala = new a();
    locala.field_key = paramString;
    locala.field_value = new byte[0];
    super.a(locala);
    AppMethodBeat.o(132772);
  }

  public final <T extends com.tencent.mm.bt.a> T e(String paramString, Class<T> paramClass)
  {
    AppMethodBeat.i(132775);
    byte[] arrayOfByte = DH(paramString);
    if (bo.cb(arrayOfByte))
    {
      AppMethodBeat.o(132775);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = (com.tencent.mm.bt.a)paramClass.newInstance();
        paramString.parseFrom(arrayOfByte);
        AppMethodBeat.o(132775);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.AppBrandCommonKVBinaryDataStorage", "getProto class[%s] e = %s", new Object[] { paramClass.getSimpleName(), paramString });
        AppMethodBeat.o(132775);
        paramString = null;
      }
    }
  }

  public final void s(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(132773);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(132773);
    while (true)
    {
      return;
      a locala = new a();
      locala.field_key = paramString;
      locala.field_value = paramArrayOfByte;
      super.a(locala);
      AppMethodBeat.o(132773);
    }
  }

  static final class a extends c
  {
    static final c.a gSs;

    @i(dpV="$$invalid", dpW=1)
    public String field_key;
    public byte[] field_value;

    static
    {
      AppMethodBeat.i(132771);
      gSs = ax(a.class);
      AppMethodBeat.o(132771);
    }

    public final c.a Ag()
    {
      return gSs;
    }

    public final ContentValues Hl()
    {
      AppMethodBeat.i(132770);
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("key", this.field_key);
      localContentValues.put("value", this.field_value);
      AppMethodBeat.o(132770);
      return localContentValues;
    }

    public final void d(Cursor paramCursor)
    {
      AppMethodBeat.i(132769);
      this.field_key = paramCursor.getString(0);
      this.field_value = paramCursor.getBlob(1);
      AppMethodBeat.o(132769);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.q.a
 * JD-Core Version:    0.6.2
 */