package com.tencent.mm.ipcinvoker.extension;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.e.a;
import com.tencent.mm.ipcinvoker.e.b;

final class XIPCInvoker$b
  implements c, a
{
  a eGA;
  c<XIPCInvoker.WrapperParcelable> eGz;

  XIPCInvoker$b(c<XIPCInvoker.WrapperParcelable> paramc)
  {
    AppMethodBeat.i(114092);
    this.eGz = paramc;
    if ((paramc instanceof a))
      this.eGA = ((a)paramc);
    AppMethodBeat.o(114092);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(114094);
    if (this.eGA == null)
      AppMethodBeat.o(114094);
    while (true)
    {
      return;
      this.eGA.a(paramb);
      AppMethodBeat.o(114094);
    }
  }

  public final void ao(Object paramObject)
  {
    AppMethodBeat.i(114093);
    if (this.eGz != null)
      this.eGz.ao(new XIPCInvoker.WrapperParcelable(null, paramObject));
    AppMethodBeat.o(114093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.XIPCInvoker.b
 * JD-Core Version:    0.6.2
 */