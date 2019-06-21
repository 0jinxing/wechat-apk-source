package com.tencent.mm.ui.chatting.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static final b yZH;
  public int mCount;
  public int mSuccessCount;
  public int tVN;
  public int yZI;
  public int yZJ;
  public int yZK;

  static
  {
    AppMethodBeat.i(32672);
    yZH = new b();
    AppMethodBeat.o(32672);
  }

  public static void ax(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32668);
    ab.i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s cleanCount:%s count:%s ", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 > 0)
    {
      e.pXa.a(403L, 67L, 1L, true);
      e.pXa.a(403L, 68L, paramInt1, true);
    }
    e.pXa.a(403L, 70L, paramInt2, true);
    if (paramInt2 <= 5)
    {
      e.pXa.a(403L, 71L, 1L, true);
      AppMethodBeat.o(32668);
    }
    while (true)
    {
      return;
      if (paramInt2 <= 10)
      {
        e.pXa.a(403L, 72L, 1L, true);
        AppMethodBeat.o(32668);
      }
      else if (paramInt2 <= 20)
      {
        e.pXa.a(403L, 73L, 1L, true);
        AppMethodBeat.o(32668);
      }
      else if (paramInt2 <= 30)
      {
        e.pXa.a(403L, 74L, 1L, true);
        AppMethodBeat.o(32668);
      }
      else if (paramInt2 <= 50)
      {
        e.pXa.a(403L, 75L, 1L, true);
        AppMethodBeat.o(32668);
      }
      else
      {
        e.pXa.a(403L, 76L, 1L, true);
        AppMethodBeat.o(32668);
      }
    }
  }

  public static void dGX()
  {
    AppMethodBeat.i(32669);
    e.pXa.a(403L, 77L, 1L, true);
    AppMethodBeat.o(32669);
  }

  public static void dGY()
  {
    AppMethodBeat.i(32670);
    e.pXa.a(403L, 41L, 1L, false);
    AppMethodBeat.o(32670);
  }

  public static void dGZ()
  {
    AppMethodBeat.i(32671);
    e.pXa.a(403L, 78L, 1L, false);
    AppMethodBeat.o(32671);
  }

  public final void Pi(int paramInt)
  {
    this.yZK += paramInt;
  }

  public final void c(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    AppMethodBeat.i(32667);
    ab.i("MicroMsg.GetChatroomReporter", "[recordFetch] isDown:" + paramBoolean1 + " isSuccess:" + paramBoolean2 + " chatroomid:" + paramString);
    if (paramBoolean1)
    {
      this.yZI += 1;
      this.mCount += 1;
      if (paramBoolean2)
        break label103;
      this.tVN += 1;
      AppMethodBeat.o(32667);
    }
    while (true)
    {
      return;
      this.yZJ += 1;
      break;
      label103: this.mSuccessCount += 1;
      AppMethodBeat.o(32667);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.b
 * JD-Core Version:    0.6.2
 */