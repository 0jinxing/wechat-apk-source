package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

final class s$1 extends ak
{
  s$1(s params, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(76687);
    if (257 == paramMessage.what)
    {
      d.c localc = (d.c)paramMessage.obj;
      for (int i = 0; i < this.oxd.oxb.size(); i++)
        if ((d.b)((WeakReference)this.oxd.oxb.valueAt(i)).get() != null)
        {
          paramMessage = s.2.oxe;
          localc.ordinal();
        }
      AppMethodBeat.o(76687);
    }
    while (true)
    {
      return;
      if (258 == paramMessage.what)
      {
        paramMessage = (d.b)paramMessage.obj;
        if (paramMessage == null)
        {
          AppMethodBeat.o(76687);
        }
        else
        {
          this.oxd.oxb.put(paramMessage.hashCode(), new WeakReference(paramMessage));
          AppMethodBeat.o(76687);
        }
      }
      else if (259 == paramMessage.what)
      {
        paramMessage = (d.b)paramMessage.obj;
        if (paramMessage == null)
          AppMethodBeat.o(76687);
        else
          this.oxd.oxb.remove(paramMessage.hashCode());
      }
      else
      {
        AppMethodBeat.o(76687);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.s.1
 * JD-Core Version:    0.6.2
 */