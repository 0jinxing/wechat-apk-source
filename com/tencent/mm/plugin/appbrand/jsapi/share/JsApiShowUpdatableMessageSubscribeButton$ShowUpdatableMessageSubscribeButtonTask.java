package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.a.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import junit.framework.Assert;

class JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask extends MainProcessTask
{
  public static final Parcelable.Creator<ShowUpdatableMessageSubscribeButtonTask> CREATOR;
  public String bQi;

  static
  {
    AppMethodBeat.i(131458);
    CREATOR = new JsApiShowUpdatableMessageSubscribeButton.ShowUpdatableMessageSubscribeButtonTask.1();
    AppMethodBeat.o(131458);
  }

  public JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask()
  {
  }

  public JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask(Parcel paramParcel)
  {
    AppMethodBeat.i(131454);
    g(paramParcel);
    AppMethodBeat.o(131454);
  }

  public final void asP()
  {
    AppMethodBeat.i(131455);
    if (g.K(k.class) == null)
    {
      ab.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "IWxaUpdateableMsgService is null, err, return");
      if (f.IS_FLAVOR_RED)
        Assert.assertTrue("IWxaUpdateableMsgService is null, err, @tummy", false);
      AppMethodBeat.o(131455);
    }
    while (true)
    {
      return;
      b localb = ((k)g.K(k.class)).pn(this.bQi);
      if ((localb != null) && ((localb.field_btnState == 2) || (localb.field_msgState != 0)))
      {
        ab.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "shareKey:%s btnState:%d msgState:%d ingore already process", new Object[] { this.bQi, Integer.valueOf(localb.field_btnState), Integer.valueOf(localb.field_msgState) });
        AppMethodBeat.o(131455);
      }
      else
      {
        ((k)g.K(k.class)).T(this.bQi, 1);
        AppMethodBeat.o(131455);
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(131456);
    this.bQi = paramParcel.readString();
    AppMethodBeat.o(131456);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131457);
    paramParcel.writeString(this.bQi);
    AppMethodBeat.o(131457);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton.ShowUpdatableMessageSubscribeButtonTask
 * JD-Core Version:    0.6.2
 */