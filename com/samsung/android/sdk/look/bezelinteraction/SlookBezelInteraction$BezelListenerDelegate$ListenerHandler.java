package com.samsung.android.sdk.look.bezelinteraction;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.samsung.android.bezelinteraction.BezelEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class SlookBezelInteraction$BezelListenerDelegate$ListenerHandler extends Handler
{
  public SlookBezelInteraction.BezelListener mListener = null;

  public SlookBezelInteraction$BezelListenerDelegate$ListenerHandler(Looper paramLooper, SlookBezelInteraction.BezelListener paramBezelListener)
  {
    super(paramLooper);
    this.mListener = paramBezelListener;
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(117212);
    if (this.mListener != null)
    {
      paramMessage = (BezelEvent)paramMessage.obj;
      if (paramMessage != null)
        this.mListener.onItemSelected(paramMessage);
    }
    AppMethodBeat.o(117212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.bezelinteraction.SlookBezelInteraction.BezelListenerDelegate.ListenerHandler
 * JD-Core Version:    0.6.2
 */