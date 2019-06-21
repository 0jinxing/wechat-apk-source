package com.tencent.mm.ab;

import a.f.b.j;
import a.l;
import a.y;
import android.os.Looper;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.math.BigInteger;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"codeConsume", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "tag", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "commonShadow", "", "textView", "Landroid/widget/TextView;", "consumeList", "T", "list", "", "freeMMHandlerThread", "Lcom/tencent/mm/sdk/platformtools/MMHandlerThread;", "threadName", "freeThread", "opAddFlag", "", "value", "flag", "opCheckFlag", "", "opCleanFlag", "reverseConsumeList", "threadPool", "uiThread", "delay", "", "ulonglong", "seq", "safeBufferToByte", "", "Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;", "safeParser", "Lcom/tencent/mm/protobuf/BaseProtoBuf;", "byteArray", "(Lcom/tencent/mm/protobuf/BaseProtoBuf;[B)Lcom/tencent/mm/protobuf/BaseProtoBuf;", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/ParameterName;", "name", "e", "(Lcom/tencent/mm/protobuf/BaseProtoBuf;[BLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/protobuf/BaseProtoBuf;", "synchronizedForEach", "", "action", "synchronizedForEachIndexed", "Lkotlin/Function2;", "index", "libktcomm_release"})
public final class b
{
  public static final <T extends com.tencent.mm.bt.a> T a(T paramT, byte[] paramArrayOfByte, a.f.a.b<? super Exception, y> paramb)
  {
    AppMethodBeat.i(114178);
    j.p(paramT, "receiver$0");
    j.p(paramb, "block");
    try
    {
      paramT.parseFrom(paramArrayOfByte);
      AppMethodBeat.o(114178);
      return paramT;
    }
    catch (Exception paramT)
    {
      while (true)
      {
        ab.b("safeParser", "", new Object[] { paramT });
        paramb.am(paramT);
        paramT = null;
        AppMethodBeat.o(114178);
      }
    }
  }

  public static final void a(long paramLong, a.f.a.a<y> parama)
  {
    AppMethodBeat.i(114174);
    j.p(parama, "block");
    al.n((Runnable)new c(parama), paramLong);
    AppMethodBeat.o(114174);
  }

  public static final void a(a.f.a.a<y> parama)
  {
    AppMethodBeat.i(114173);
    j.p(parama, "block");
    Thread localThread = Thread.currentThread();
    Looper localLooper = Looper.getMainLooper();
    j.o(localLooper, "Looper.getMainLooper()");
    if (j.j(localThread, localLooper.getThread()))
    {
      parama.invoke();
      AppMethodBeat.o(114173);
    }
    while (true)
    {
      return;
      al.d((Runnable)new c(parama));
      AppMethodBeat.o(114173);
    }
  }

  public static final <R> void a(a.f.a.a<? extends R> parama, String paramString)
  {
    AppMethodBeat.i(114176);
    j.p(parama, "block");
    j.p(paramString, "threadName");
    paramString = new al(paramString);
    paramString.aa((Runnable)new b.c(parama, paramString));
    AppMethodBeat.o(114176);
  }

  public static final void a(String paramString, a.f.a.a<y> parama)
  {
    AppMethodBeat.i(114175);
    j.p(paramString, "threadName");
    j.p(parama, "block");
    d.post((Runnable)new c(parama), paramString);
    AppMethodBeat.o(114175);
  }

  public static final <R> al b(a.f.a.a<? extends R> parama, String paramString)
  {
    AppMethodBeat.i(114177);
    j.p(parama, "block");
    j.p(paramString, "threadName");
    paramString = new al(paramString);
    paramString.aa((Runnable)new b.b(parama));
    AppMethodBeat.o(114177);
    return paramString;
  }

  public static final boolean cf(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static final void f(TextView paramTextView)
  {
    AppMethodBeat.i(114180);
    j.p(paramTextView, "textView");
    paramTextView.setShadowLayer(com.tencent.mm.bz.a.fromDPToPix(paramTextView.getContext(), 3), 0.0F, com.tencent.mm.bz.a.fromDPToPix(paramTextView.getContext(), 1), -2147483648);
    AppMethodBeat.o(114180);
  }

  public static final String fe(long paramLong)
  {
    AppMethodBeat.i(114179);
    String str = new BigInteger(Long.toBinaryString(paramLong), 2).toString();
    j.o(str, "big.toString()");
    AppMethodBeat.o(114179);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.b
 * JD-Core Version:    0.6.2
 */