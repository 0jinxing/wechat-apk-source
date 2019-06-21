package com.tencent.mm.ui.chatting.viewitems;

import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;

final class w$7$1
  implements Runnable
{
  w$7$1(w.7 param7, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33133);
    o.ahp().a(this.kUM, this.zfk.zfi.zjr, w.f(this.zfk.zeW));
    if (TextUtils.isEmpty(this.zfj));
    for (String str = this.zfk.zfe; ; str = this.zfj)
    {
      this.zfk.zfi.zjs.setText(str);
      AppMethodBeat.o(33133);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.7.1
 * JD-Core Version:    0.6.2
 */