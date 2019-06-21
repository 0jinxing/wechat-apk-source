package com.tencent.mm.d.a;

import android.util.SparseArray;
import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.utils.V8ObjectUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class r$2
  implements JavaCallback
{
  r$2(r paramr, l paraml)
  {
  }

  public final Object invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(113871);
    if ((paramV8Array.length() < 2) || (paramV8Array.getType(0) != 7))
    {
      ab.w("MicroMsg.J2V8.V8DirectApiTimer", "setInterval parameters invalid length:%d type[0]:%d", new Object[] { Integer.valueOf(paramV8Array.length()), Integer.valueOf(paramV8Array.getType(0)) });
      AppMethodBeat.o(113871);
      paramV8Object = null;
      return paramV8Object;
    }
    V8Function localV8Function = (V8Function)paramV8Array.getObject(0);
    int i;
    label89: l locall;
    if (paramV8Array.getType(1) == 1)
    {
      i = paramV8Array.getInteger(1);
      if (paramV8Array.length() <= 2)
        break label305;
      paramV8Object = V8ObjectUtils.toList(paramV8Array);
      paramV8Object = V8ObjectUtils.toV8Array(this.cii.CB(), paramV8Object.subList(2, paramV8Object.size() - 1));
      label128: paramV8Array = this.cir;
      locall = this.cii;
      paramV8Array.cin += 1;
      if (!(locall.chO instanceof b))
        break label321;
    }
    label305: label321: for (paramV8Object = new r.c(paramV8Array, locall, paramV8Array.cin, localV8Function, paramV8Object, true, i); ; paramV8Object = new r.a(paramV8Array, locall, paramV8Array.cin, localV8Function, paramV8Object, true, i))
    {
      paramV8Object.schedule();
      paramV8Array.cio.put(paramV8Array.cin, paramV8Object);
      paramV8Object = Integer.valueOf(paramV8Array.cin);
      AppMethodBeat.o(113871);
      break;
      if (paramV8Array.getType(1) == 2)
      {
        i = (int)paramV8Array.getDouble(1);
        break label89;
      }
      if (paramV8Array.getType(1) == 4)
      {
        int j = r.dt(paramV8Array.getString(1));
        i = j;
        if (j != -2147483648)
          break label89;
        AppMethodBeat.o(113871);
        paramV8Object = null;
        break;
      }
      ab.w("MicroMsg.J2V8.V8DirectApiTimer", "setInterval parameters[1] type:%d", new Object[] { Integer.valueOf(paramV8Array.getType(1)) });
      AppMethodBeat.o(113871);
      paramV8Object = null;
      break;
      paramV8Object = this.cii.CB().newV8Array();
      break label128;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.r.2
 * JD-Core Version:    0.6.2
 */