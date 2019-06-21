package com.tencent.mm.cb;

import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.d;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bo;

public final class g
  implements d
{
  private static g xGr;
  private int xGq = 300;

  public static g dqQ()
  {
    AppMethodBeat.i(62691);
    if (xGr == null)
      xGr = new g();
    g localg = xGr;
    AppMethodBeat.o(62691);
    return localg;
  }

  private SpannableString p(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(62694);
    if ((paramCharSequence == null) || (bo.isNullOrNil(paramCharSequence.toString())))
    {
      paramCharSequence = new SpannableString("");
      AppMethodBeat.o(62694);
      return paramCharSequence;
    }
    if ((paramCharSequence instanceof SpannableString));
    for (paramCharSequence = (SpannableString)paramCharSequence; ; paramCharSequence = new SpannableString(paramCharSequence))
    {
      PInt localPInt = new PInt();
      localPInt.value = this.xGq;
      paramCharSequence = b.dqD().a(paramCharSequence, paramInt, localPInt);
      paramCharSequence = f.dqL().b(paramCharSequence, paramInt, localPInt.value);
      AppMethodBeat.o(62694);
      break;
    }
  }

  public final boolean G(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(62696);
    b.dqD();
    boolean bool = b.anT(paramCharSequence.toString());
    AppMethodBeat.o(62696);
    return bool;
  }

  public final boolean H(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(62695);
    boolean bool = f.dqL().anV(paramCharSequence.toString());
    AppMethodBeat.o(62695);
    return bool;
  }

  public final SpannableString b(CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(62693);
    if ((paramCharSequence == null) || (bo.isNullOrNil(paramCharSequence.toString())))
    {
      paramCharSequence = new SpannableString("");
      AppMethodBeat.o(62693);
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = o(paramCharSequence, (int)paramFloat);
      AppMethodBeat.o(62693);
    }
  }

  public final SpannableString o(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(62692);
    if ((paramCharSequence == null) || (bo.isNullOrNil(paramCharSequence.toString())))
    {
      paramCharSequence = new SpannableString("");
      AppMethodBeat.o(62692);
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = p(paramCharSequence, paramInt);
      AppMethodBeat.o(62692);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cb.g
 * JD-Core Version:    0.6.2
 */