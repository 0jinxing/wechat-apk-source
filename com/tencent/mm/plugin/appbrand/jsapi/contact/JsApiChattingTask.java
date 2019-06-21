package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public class JsApiChattingTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiChattingTask> CREATOR;
  public Runnable hww;
  public String nickname;
  public String sessionFrom;
  public String username;

  static
  {
    AppMethodBeat.i(130990);
    CREATOR = new JsApiChattingTask.2();
    AppMethodBeat.o(130990);
  }

  public JsApiChattingTask()
  {
  }

  public JsApiChattingTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130984);
    g(paramParcel);
    AppMethodBeat.o(130984);
  }

  public final void asP()
  {
    AppMethodBeat.i(130985);
    if (!g.RN().eJb)
    {
      aCb();
      AppMethodBeat.o(130985);
    }
    while (true)
    {
      return;
      ad localad = ((j)g.K(j.class)).XM().aoO(this.username);
      ab.d("MicroMsg.JsApiChattingTask", "sessionFrom:%s,username:%s,nickname:%s", new Object[] { this.sessionFrom, this.username, this.nickname });
      if ((localad == null) || ((int)localad.ewQ == 0))
      {
        localad = new ad(this.username);
        localad.setType(0);
        localad.iB(this.nickname);
        ((j)g.K(j.class)).XM().Z(localad);
        ab.i("MicroMsg.JsApiChattingTask", "%s save to contact_table", new Object[] { this.username });
      }
      ((d)g.K(d.class)).b(this.username, new JsApiChattingTask.1(this));
      AppMethodBeat.o(130985);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130986);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(130986);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130987);
    this.sessionFrom = paramParcel.readString();
    this.username = paramParcel.readString();
    this.nickname = paramParcel.readString();
    AppMethodBeat.o(130987);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130988);
    paramParcel.writeString(this.sessionFrom);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.nickname);
    AppMethodBeat.o(130988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask
 * JD-Core Version:    0.6.2
 */