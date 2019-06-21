package com.tencent.soter.core.a;

import android.content.Context;
import android.os.CancellationSignal;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.d;

public final class a
{
  static final a.e AuH;
  private Context mContext;

  static
  {
    AppMethodBeat.i(72987);
    if (com.tencent.soter.core.a.dQN())
    {
      AuH = new a.a();
      AppMethodBeat.o(72987);
    }
    while (true)
    {
      return;
      AuH = new a.f();
      AppMethodBeat.o(72987);
    }
  }

  private a(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public static a iU(Context paramContext)
  {
    AppMethodBeat.i(72983);
    paramContext = new a(paramContext);
    AppMethodBeat.o(72983);
    return paramContext;
  }

  public final void a(a.d paramd, CancellationSignal paramCancellationSignal, a.b paramb)
  {
    AppMethodBeat.i(72986);
    AuH.a(this.mContext, paramd, paramCancellationSignal, paramb);
    AppMethodBeat.o(72986);
  }

  public final boolean hasEnrolledFingerprints()
  {
    AppMethodBeat.i(72984);
    boolean bool = AuH.hasEnrolledFingerprints(this.mContext);
    AppMethodBeat.o(72984);
    return bool;
  }

  public final boolean isHardwareDetected()
  {
    AppMethodBeat.i(72985);
    boolean bool = AuH.isHardwareDetected(this.mContext);
    AppMethodBeat.o(72985);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.a.a
 * JD-Core Version:    0.6.2
 */