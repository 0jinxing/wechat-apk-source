package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.o;

final class MailAddrsViewControl$8 extends GestureDetector.SimpleOnGestureListener
{
  MailAddrsViewControl$8(MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  private void cdk()
  {
    AppMethodBeat.i(68345);
    o localo = (o)MailAddrsViewControl.c(this.pyG).getTag();
    if (MailAddrsViewControl.g(this.pyG) != null)
    {
      MailAddrsViewControl.g(this.pyG);
      MailAddrsViewControl.c(this.pyG);
    }
    Intent localIntent = new Intent(this.pyG.getContext(), MailAddrProfileUI.class);
    localIntent.putExtra("name", localo.name);
    localIntent.putExtra("addr", localo.nJq);
    if (!MailAddrsViewControl.h(this.pyG));
    for (boolean bool = true; ; bool = false)
    {
      localIntent.putExtra("can_compose", bool);
      this.pyG.getContext().startActivity(localIntent);
      AppMethodBeat.o(68345);
      return;
    }
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(68348);
    cdk();
    AppMethodBeat.o(68348);
    return true;
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(68347);
    if ((MailAddrsViewControl.g(this.pyG) != null) && (MailAddrsViewControl.c(this.pyG) != null))
    {
      MailAddrsViewControl.g(this.pyG);
      MailAddrsViewControl.c(this.pyG);
      MailAddrsViewControl.c(this.pyG).getTag();
    }
    AppMethodBeat.o(68347);
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(68346);
    if (!MailAddrsViewControl.h(this.pyG))
      cdk();
    AppMethodBeat.o(68346);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.8
 * JD-Core Version:    0.6.2
 */