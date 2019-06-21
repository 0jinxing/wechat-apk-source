package com.tencent.mm.plugin.normsg.a;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;

public enum b
  implements a
{
  private static a oTP;

  static
  {
    AppMethodBeat.i(115605);
    oTO = new b("INSTANCE");
    oTQ = new b[] { oTO };
    oTP = new a((byte)0);
    AppMethodBeat.o(115605);
  }

  public static void a(a parama)
  {
    if (parama != null)
      oTP = parama;
  }

  public final byte[] Am(int paramInt)
  {
    AppMethodBeat.i(115578);
    byte[] arrayOfByte = oTP.Am(paramInt);
    AppMethodBeat.o(115578);
    return arrayOfByte;
  }

  public final String An(int paramInt)
  {
    AppMethodBeat.i(115581);
    String str = oTP.An(paramInt);
    AppMethodBeat.o(115581);
    return str;
  }

  public final void Ao(int paramInt)
  {
    AppMethodBeat.i(115593);
    oTP.Ao(paramInt);
    AppMethodBeat.o(115593);
  }

  public final void TI(String paramString)
  {
    AppMethodBeat.i(115595);
    oTP.TI(paramString);
    AppMethodBeat.o(115595);
  }

  public final void TJ(String paramString)
  {
    AppMethodBeat.i(115596);
    oTP.TJ(paramString);
    AppMethodBeat.o(115596);
  }

  public final void TK(String paramString)
  {
    AppMethodBeat.i(115597);
    oTP.TK(paramString);
    AppMethodBeat.o(115597);
  }

  public final boolean TL(String paramString)
  {
    AppMethodBeat.i(115598);
    boolean bool = oTP.TL(paramString);
    AppMethodBeat.o(115598);
    return bool;
  }

  public final byte[] TM(String paramString)
  {
    AppMethodBeat.i(115599);
    paramString = oTP.TM(paramString);
    AppMethodBeat.o(115599);
    return paramString;
  }

  public final void TN(String paramString)
  {
    AppMethodBeat.i(115602);
    oTP.TN(paramString);
    AppMethodBeat.o(115602);
  }

  public final boolean TO(String paramString)
  {
    AppMethodBeat.i(115603);
    boolean bool = oTP.TO(paramString);
    AppMethodBeat.o(115603);
    return bool;
  }

  public final byte[] TP(String paramString)
  {
    AppMethodBeat.i(115604);
    paramString = oTP.TP(paramString);
    AppMethodBeat.o(115604);
    return paramString;
  }

  public final String TQ(String paramString)
  {
    AppMethodBeat.i(115580);
    paramString = oTP.TQ(paramString);
    AppMethodBeat.o(115580);
    return paramString;
  }

  public final void a(View paramView, Class<? extends com.tencent.mm.sdk.b.b> paramClass)
  {
    AppMethodBeat.i(115592);
    oTP.a(paramView, paramClass);
    AppMethodBeat.o(115592);
  }

  public final void a(String paramString, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(115601);
    oTP.a(paramString, paramMotionEvent);
    AppMethodBeat.o(115601);
  }

  public final boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2, PByteArray paramPByteArray)
  {
    AppMethodBeat.i(115594);
    boolean bool = oTP.a(paramInt1, paramArrayOfByte, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPByteArray);
    AppMethodBeat.o(115594);
    return bool;
  }

  public final void ae(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(115579);
    oTP.ae(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(115579);
  }

  public final boolean bVI()
  {
    AppMethodBeat.i(115584);
    boolean bool = oTP.bVI();
    AppMethodBeat.o(115584);
    return bool;
  }

  public final boolean bVL()
  {
    AppMethodBeat.i(115586);
    boolean bool = oTP.bVL();
    AppMethodBeat.o(115586);
    return bool;
  }

  public final boolean bVM()
  {
    AppMethodBeat.i(115587);
    boolean bool = oTP.bVM();
    AppMethodBeat.o(115587);
    return bool;
  }

  public final boolean bVN()
  {
    AppMethodBeat.i(115588);
    boolean bool = oTP.bVN();
    AppMethodBeat.o(115588);
    return bool;
  }

  public final String bVQ()
  {
    AppMethodBeat.i(115583);
    String str = oTP.bVQ();
    AppMethodBeat.o(115583);
    return str;
  }

  public final boolean bVR()
  {
    AppMethodBeat.i(115585);
    boolean bool = oTP.bVR();
    AppMethodBeat.o(115585);
    return bool;
  }

  public final byte[] bVS()
  {
    AppMethodBeat.i(115590);
    byte[] arrayOfByte = oTP.bVS();
    AppMethodBeat.o(115590);
    return arrayOfByte;
  }

  public final boolean c(Object paramObject, Class paramClass)
  {
    AppMethodBeat.i(115589);
    boolean bool = oTP.c(paramObject, paramClass);
    AppMethodBeat.o(115589);
    return bool;
  }

  public final boolean cg(Object paramObject)
  {
    AppMethodBeat.i(115591);
    boolean bool = oTP.cg(paramObject);
    AppMethodBeat.o(115591);
    return bool;
  }

  public final void fu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(115600);
    oTP.fu(paramString1, paramString2);
    AppMethodBeat.o(115600);
  }

  public final String jE(boolean paramBoolean)
  {
    AppMethodBeat.i(115582);
    String str = oTP.jE(paramBoolean);
    AppMethodBeat.o(115582);
    return str;
  }

  static final class a
    implements a
  {
    public final byte[] Am(int paramInt)
    {
      AppMethodBeat.i(115549);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115549);
      return new byte[0];
    }

    public final String An(int paramInt)
    {
      AppMethodBeat.i(115552);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115552);
      return "";
    }

    public final void Ao(int paramInt)
    {
      AppMethodBeat.i(115564);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115564);
    }

    public final void TI(String paramString)
    {
      AppMethodBeat.i(115566);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115566);
    }

    public final void TJ(String paramString)
    {
      AppMethodBeat.i(115567);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115567);
    }

    public final void TK(String paramString)
    {
      AppMethodBeat.i(115568);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115568);
    }

    public final boolean TL(String paramString)
    {
      AppMethodBeat.i(115569);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115569);
      return false;
    }

    public final byte[] TM(String paramString)
    {
      AppMethodBeat.i(115570);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115570);
      return new byte[0];
    }

    public final void TN(String paramString)
    {
      AppMethodBeat.i(115573);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115573);
    }

    public final boolean TO(String paramString)
    {
      AppMethodBeat.i(115574);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115574);
      return false;
    }

    public final byte[] TP(String paramString)
    {
      AppMethodBeat.i(115575);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115575);
      return new byte[0];
    }

    public final String TQ(String paramString)
    {
      AppMethodBeat.i(115551);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115551);
      return paramString;
    }

    public final void a(View paramView, Class<? extends com.tencent.mm.sdk.b.b> paramClass)
    {
      AppMethodBeat.i(115563);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115563);
    }

    public final void a(String paramString, MotionEvent paramMotionEvent)
    {
      AppMethodBeat.i(115572);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115572);
    }

    public final boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2, PByteArray paramPByteArray)
    {
      AppMethodBeat.i(115565);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115565);
      return false;
    }

    public final void ae(int paramInt1, int paramInt2, int paramInt3)
    {
      AppMethodBeat.i(115550);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115550);
    }

    public final boolean bVI()
    {
      AppMethodBeat.i(115555);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115555);
      return false;
    }

    public final boolean bVL()
    {
      AppMethodBeat.i(115557);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115557);
      return false;
    }

    public final boolean bVM()
    {
      AppMethodBeat.i(115558);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115558);
      return false;
    }

    public final boolean bVN()
    {
      AppMethodBeat.i(115559);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115559);
      return false;
    }

    public final String bVQ()
    {
      AppMethodBeat.i(115554);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115554);
      return "";
    }

    public final boolean bVR()
    {
      AppMethodBeat.i(115556);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115556);
      return false;
    }

    public final byte[] bVS()
    {
      AppMethodBeat.i(115561);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115561);
      return new byte[0];
    }

    public final boolean c(Object paramObject, Class paramClass)
    {
      AppMethodBeat.i(115560);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115560);
      return false;
    }

    public final boolean cg(Object paramObject)
    {
      AppMethodBeat.i(115562);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115562);
      return false;
    }

    public final void fu(String paramString1, String paramString2)
    {
      AppMethodBeat.i(115571);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115571);
    }

    public final String jE(boolean paramBoolean)
    {
      AppMethodBeat.i(115553);
      ab.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      AppMethodBeat.o(115553);
      return "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.a.b
 * JD-Core Version:    0.6.2
 */