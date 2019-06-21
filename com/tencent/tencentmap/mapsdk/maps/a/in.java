package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import android.os.Message;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cp;
import com.tencent.tencentmap.mapsdk.a.dp;

public class in extends Handler
{
  private final iz a;

  public in(iz paramiz)
  {
    this.a = paramiz;
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(99860);
    super.handleMessage(paramMessage);
    if (this.a == null)
      AppMethodBeat.o(99860);
    cp localcp;
    while (true)
    {
      return;
      localcp = this.a.p();
      if (localcp != null)
        break;
      AppMethodBeat.o(99860);
    }
    if (this.a.q == null)
    {
      if (paramMessage.what != 0)
        break label149;
      this.a.J = false;
      this.a.K = true;
      this.a.onCameraChange(localcp);
    }
    while (true)
    {
      if (this.a.o() != null)
        this.a.o().e();
      if (this.a.K() != null)
        this.a.K().a(this.a.Q(), this.a.b().e());
      AppMethodBeat.o(99860);
      break;
      label149: if (paramMessage.what == 1)
      {
        this.a.J = true;
        if ((this.a.J) && (this.a.L == 0))
        {
          this.a.K = false;
          this.a.onCameraChangeFinished(localcp);
        }
        if ((this.a.k != null) && (this.a.H))
          this.a.k.a();
        this.a.b().F();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.in
 * JD-Core Version:    0.6.2
 */