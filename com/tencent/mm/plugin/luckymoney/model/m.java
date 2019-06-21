package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.b.c;

public final class m extends c<bf>
{
  public static final String nXE;

  static
  {
    AppMethodBeat.i(42333);
    nXE = com.tencent.mm.loader.j.b.eSj + "/luckymoney/";
    AppMethodBeat.o(42333);
  }

  public m()
  {
    AppMethodBeat.i(42327);
    this.xxI = bf.class.getName().hashCode();
    AppMethodBeat.o(42327);
  }

  public static void bLy()
  {
    AppMethodBeat.i(42328);
    b.c.dif();
    com.tencent.mm.pluginsdk.g.a.a.b.Ky(58);
    AppMethodBeat.o(42328);
  }

  public static String xR(int paramInt)
  {
    AppMethodBeat.i(42329);
    String str = nXE + paramInt + "/";
    AppMethodBeat.o(42329);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.m
 * JD-Core Version:    0.6.2
 */