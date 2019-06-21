package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.e;
import com.tencent.mm.i.h;
import com.tencent.mm.modelvideo.b.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.c.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class AppBrandOnlineVideoProxy
  implements com.tencent.mm.modelvideo.b
{
  private OnlineVideoProxy hYl;
  private b.a hYm;

  public final void a(b.a parama)
  {
    this.hYm = parama;
    if (this.hYl != null)
      this.hYl.hYz = parama;
  }

  public final void dV(String paramString)
  {
    AppMethodBeat.i(131518);
    ab.i("MicroMsg.AppBrandOnlineVideoProxy", "%s stop http stream[%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (this.hYl != null)
    {
      this.hYl.hYz = null;
      paramString = this.hYl;
      paramString.hYq = 4;
      AppBrandMainProcessService.a(paramString);
      this.hYl.aBW();
    }
    this.hYl = null;
    AppMethodBeat.o(131518);
  }

  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131520);
    boolean bool;
    if (this.hYl == null)
    {
      bool = false;
      AppMethodBeat.o(131520);
    }
    while (true)
    {
      return bool;
      paramString = this.hYl;
      paramString.offset = paramInt1;
      paramString.length = paramInt2;
      paramString.hYq = 3;
      AppBrandMainProcessService.b(paramString);
      bool = paramString.hYw;
      AppMethodBeat.o(131520);
    }
  }

  public final void r(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(131517);
    ab.i("MicroMsg.AppBrandOnlineVideoProxy", "%s start http stream[%s, %s, %s]", new Object[] { Integer.valueOf(hashCode()), paramString1, paramString2, paramString3 });
    if (this.hYl == null)
    {
      this.hYl = new OnlineVideoProxy();
      this.hYl.hYz = this.hYm;
      this.hYl.aBV();
    }
    OnlineVideoProxy localOnlineVideoProxy = this.hYl;
    ab.i("MicroMsg.AppBrandOnlineVideoProxy", "%s OnlineVideoProxy start http stream[%s %s %s] ", new Object[] { Integer.valueOf(localOnlineVideoProxy.hashCode()), paramString1, paramString2, paramString3 });
    localOnlineVideoProxy.fUL = paramString1;
    localOnlineVideoProxy.path = paramString2;
    localOnlineVideoProxy.url = paramString3;
    localOnlineVideoProxy.hYq = 1;
    AppBrandMainProcessService.a(localOnlineVideoProxy);
    AppMethodBeat.o(131517);
  }

  public final void requestVideoData(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131519);
    ab.i("MicroMsg.AppBrandOnlineVideoProxy", "%s requestVideoData [%s, %d %d]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.hYl != null)
    {
      paramString = this.hYl;
      paramString.offset = paramInt1;
      paramString.length = paramInt2;
      paramString.hYq = 2;
      AppBrandMainProcessService.a(paramString);
    }
    AppMethodBeat.o(131519);
  }

  static class OnlineVideoProxy extends MainProcessTask
  {
    public static final Parcelable.Creator<OnlineVideoProxy> CREATOR;
    final int START;
    final int STOP;
    String fUL;
    d.c hYA;
    final int hYn;
    final int hYo;
    final int hYp;
    int hYq;
    final int hYr;
    final int hYs;
    final int hYt;
    final int hYu;
    int hYv;
    boolean hYw;
    int hYx;
    int hYy;
    b.a hYz;
    int length;
    int offset;
    String path;
    String url;

    static
    {
      AppMethodBeat.i(131516);
      CREATOR = new AppBrandOnlineVideoProxy.OnlineVideoProxy.2();
      AppMethodBeat.o(131516);
    }

    public OnlineVideoProxy()
    {
      AppMethodBeat.i(131506);
      this.hYn = 0;
      this.START = 1;
      this.hYo = 2;
      this.hYp = 3;
      this.STOP = 4;
      this.hYr = 10;
      this.hYs = 11;
      this.hYt = 12;
      this.hYu = 13;
      this.hYw = false;
      this.hYA = new AppBrandOnlineVideoProxy.OnlineVideoProxy.1(this);
      AppMethodBeat.o(131506);
    }

    public OnlineVideoProxy(Parcel paramParcel)
    {
      AppMethodBeat.i(131507);
      this.hYn = 0;
      this.START = 1;
      this.hYo = 2;
      this.hYp = 3;
      this.STOP = 4;
      this.hYr = 10;
      this.hYs = 11;
      this.hYt = 12;
      this.hYu = 13;
      this.hYw = false;
      this.hYA = new AppBrandOnlineVideoProxy.OnlineVideoProxy.1(this);
      g(paramParcel);
      AppMethodBeat.o(131507);
    }

    public final void asP()
    {
      AppMethodBeat.i(131509);
      ab.d("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess cdnMediaId[%s] state[%d]", new Object[] { this.fUL, Integer.valueOf(this.hYq) });
      switch (this.hYq)
      {
      default:
        ab.w("MicroMsg.AppBrandOnlineVideoProxy", "unknow state ");
        this.hYq = 0;
        ab.i("MicroMsg.AppBrandOnlineVideoProxy", "runInMainProcess reset mainState[%d] ", new Object[] { Integer.valueOf(this.hYq) });
        aCb();
        AppMethodBeat.o(131509);
      case 1:
      case 4:
      case 2:
      case 3:
      }
      while (true)
      {
        return;
        Object localObject1 = f.auY();
        String str1 = this.fUL;
        Object localObject2 = this.hYA;
        ((com.tencent.mm.plugin.appbrand.c.b)localObject1).hew.put(str1, localObject2);
        localObject1 = f.auY();
        String str2 = this.fUL;
        str1 = this.url;
        String str3 = this.path;
        ab.i("MicroMsg.AppbrandCdnService", "add online video task [%s] url[%s] path[%s]", new Object[] { str2, str1, str3 });
        localObject2 = new h();
        ((h)localObject2).field_mediaId = str2;
        ((h)localObject2).field_fullpath = str3;
        ((h)localObject2).url = str1;
        ((h)localObject2).egK = ((com.tencent.mm.plugin.appbrand.c.b)localObject1).hex;
        ((h)localObject2).egD = 1;
        ((h)localObject2).egy = 4;
        o.alm().a((h)localObject2, false);
        break;
        f.auY().yD(this.fUL);
        f.auY();
        localObject1 = this.fUL;
        ab.i("MicroMsg.AppbrandCdnService", "cancel online video task [%s]", new Object[] { localObject1 });
        o.alm().m((String)localObject1, null);
        break;
        f.auY();
        localObject1 = this.fUL;
        int i = this.offset;
        int j = this.length;
        ab.i("MicroMsg.AppbrandCdnService", "request online video task [%s]", new Object[] { localObject1 });
        o.alm();
        e.k((String)localObject1, i, j);
        break;
        f.auY();
        localObject1 = this.fUL;
        i = this.offset;
        j = this.length;
        ab.i("MicroMsg.AppbrandCdnService", "check online video task [%s]", new Object[] { localObject1 });
        this.hYw = o.alm().isVideoDataAvailable((String)localObject1, i, j);
        aCb();
        AppMethodBeat.o(131509);
      }
    }

    public final void asQ()
    {
      AppMethodBeat.i(131508);
      ab.d("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess cdnMediaId[%s] clientState[%d] [%d %d]", new Object[] { this.fUL, Integer.valueOf(this.hYv), Integer.valueOf(this.hYx), Integer.valueOf(this.hYy) });
      if (this.hYz == null)
      {
        AppMethodBeat.o(131508);
        return;
      }
      switch (this.hYv)
      {
      default:
      case 10:
      case 11:
      case 12:
      case 13:
      }
      while (true)
      {
        this.hYv = 0;
        ab.i("MicroMsg.AppBrandOnlineVideoProxy", "runInClientProcess reset clientState[%d] ", new Object[] { Integer.valueOf(this.hYv) });
        AppMethodBeat.o(131508);
        break;
        this.hYz.ml(this.hYx);
        continue;
        this.hYz.onDataAvailable(this.fUL, this.hYx, this.hYy);
        continue;
        this.hYz.h(this.fUL, this.hYx, this.hYy);
        continue;
        this.hYz.ad(this.fUL, this.hYx);
      }
    }

    public final void g(Parcel paramParcel)
    {
      boolean bool = true;
      AppMethodBeat.i(131510);
      this.fUL = paramParcel.readString();
      this.hYq = paramParcel.readInt();
      this.path = paramParcel.readString();
      this.url = paramParcel.readString();
      this.offset = paramParcel.readInt();
      this.length = paramParcel.readInt();
      if (paramParcel.readInt() == 1);
      while (true)
      {
        this.hYw = bool;
        this.hYv = paramParcel.readInt();
        this.hYx = paramParcel.readInt();
        this.hYy = paramParcel.readInt();
        AppMethodBeat.o(131510);
        return;
        bool = false;
      }
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(131511);
      paramParcel.writeString(this.fUL);
      paramParcel.writeInt(this.hYq);
      paramParcel.writeString(this.path);
      paramParcel.writeString(this.url);
      paramParcel.writeInt(this.offset);
      paramParcel.writeInt(this.length);
      if (this.hYw);
      for (paramInt = 1; ; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeInt(this.hYv);
        paramParcel.writeInt(this.hYx);
        paramParcel.writeInt(this.hYy);
        AppMethodBeat.o(131511);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandOnlineVideoProxy
 * JD-Core Version:    0.6.2
 */