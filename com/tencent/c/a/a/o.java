package com.tencent.c.a.a;

import android.content.Context;
import android.provider.Settings.System;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o extends q
{
  public o(Context paramContext)
  {
    super(paramContext);
  }

  protected final void a(a parama)
  {
    AppMethodBeat.i(125739);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("write CheckEntity to Settings.System:");
      localStringBuilder.append(parama.toString());
      s.zX();
      p.aH(this.context).u(s.decode("4kU71lN96TJUomD1vOU9lgj9U+kKmxDPLVM+zzjst5U="), parama.toString());
      return;
    }
    finally
    {
      AppMethodBeat.o(125739);
    }
    throw parama;
  }

  protected final String read()
  {
    AppMethodBeat.i(125736);
    try
    {
      s.zX();
      String str = Settings.System.getString(this.context.getContentResolver(), s.decode("4kU71lN96TJUomD1vOU9lgj9Tw=="));
      return str;
    }
    finally
    {
      AppMethodBeat.o(125736);
    }
  }

  protected final void write(String paramString)
  {
    AppMethodBeat.i(125737);
    try
    {
      s.zX();
      p.aH(this.context).u(s.decode("4kU71lN96TJUomD1vOU9lgj9Tw=="), paramString);
      return;
    }
    finally
    {
      AppMethodBeat.o(125737);
    }
    throw paramString;
  }

  protected final boolean zO()
  {
    AppMethodBeat.i(125735);
    boolean bool = s.q(this.context, "android.permission.WRITE_SETTINGS");
    AppMethodBeat.o(125735);
    return bool;
  }

  protected final a zP()
  {
    AppMethodBeat.i(125738);
    try
    {
      Object localObject1 = Settings.System.getString(this.context.getContentResolver(), s.decode("4kU71lN96TJUomD1vOU9lgj9U+kKmxDPLVM+zzjst5U="));
      a locala = new com/tencent/c/a/a/a;
      locala.<init>((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("read readCheckEntity from Settings.System:");
      ((StringBuilder)localObject1).append(locala.toString());
      s.zX();
      return locala;
    }
    finally
    {
      AppMethodBeat.o(125738);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.o
 * JD-Core Version:    0.6.2
 */