package com.tencent.mm.plugin.webview.ui.tools;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.stub.e.a;

public class WebViewStubCallbackWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewStubCallbackWrapper> CREATOR;
  public int id;
  public e uuT;

  static
  {
    AppMethodBeat.i(7803);
    CREATOR = new WebViewStubCallbackWrapper.1();
    AppMethodBeat.o(7803);
  }

  private WebViewStubCallbackWrapper(IBinder paramIBinder)
  {
    AppMethodBeat.i(7802);
    this.uuT = e.a.H(paramIBinder);
    AppMethodBeat.o(7802);
  }

  public WebViewStubCallbackWrapper(e parame, int paramInt)
  {
    this.uuT = parame;
    this.id = paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (!(paramObject instanceof WebViewStubCallbackWrapper));
    while (true)
    {
      return bool;
      if (((WebViewStubCallbackWrapper)paramObject).id == this.id)
        bool = true;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(7801);
    paramParcel.writeStrongBinder(this.uuT.asBinder());
    AppMethodBeat.o(7801);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper
 * JD-Core Version:    0.6.2
 */