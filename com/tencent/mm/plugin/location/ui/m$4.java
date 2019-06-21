package com.tencent.mm.plugin.location.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.plugin.location.ui.impl.TrackPoint;
import com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar;
import com.tencent.mm.plugin.location_soso.ViewManager;
import com.tencent.mm.protocal.protobuf.bku;
import com.tencent.mm.protocal.protobuf.cmj;
import com.tencent.mm.sdk.platformtools.ab;

final class m$4
  implements b.a
{
  m$4(m paramm)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113562);
    if (!paramBoolean)
    {
      paramBoolean = false;
      AppMethodBeat.o(113562);
    }
    m localm;
    StringBuffer localStringBuffer;
    while (true)
    {
      return paramBoolean;
      localm = this.nOf;
      paramDouble1 = paramFloat2;
      paramDouble2 = paramFloat1;
      localStringBuffer = new StringBuffer();
      localStringBuffer.append("[refreshMyLocation] ");
      localStringBuffer.append(String.format("latitude = %f, longtitude = %f", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) }));
      if (localm.nKI == null)
      {
        localm.nKI = new cmj();
        localObject = new bku();
        localm.nKI.xkm = ((bku)localObject);
        localObject = r.Yz();
        localm.nKI.vHl = ((String)localObject);
        localm.nKI.xkm.vNI = paramDouble1;
        localm.nKI.xkm.vNH = paramDouble2;
        if ((localm.nLH) && (localm.nNQ))
          localm.bKf();
      }
      localm.nKI.xkm.vNI = paramDouble1;
      localm.nKI.xkm.vNH = paramDouble2;
      localObject = localm.nLG.getViewByItag(localm.nKI.vHl);
      if (localObject == null)
        break;
      localStringBuffer.append("[ view is not null hasCode: " + localObject.hashCode() + " ] ");
      ab.d("MicroMsg.TrackPointViewMgrImpl", localStringBuffer.toString());
      if ((localObject instanceof TrackPoint))
      {
        localm.nNO = ((TrackPoint)localObject);
        ab.d("MicroMsg.TrackPointViewMgrImpl", "udpate view layout");
        localm.nNO.n(paramDouble1, paramDouble2);
      }
      if (localm.nNX)
        localm.nLG.getIController().setCenter(localm.nKI.xkm.vNI, localm.nKI.xkm.vNH);
      paramBoolean = true;
      AppMethodBeat.o(113562);
    }
    Object localObject = new TrackPoint(localm.mContext, (ViewManager)localm.nLG.getViewManager(), (byte)0);
    localm.nLG.addView(localObject, 0.0D, 0.0D, localm.nKI.vHl);
    ((TrackPoint)localObject).o(paramDouble1, paramDouble2);
    if (localm.nNV)
    {
      ((TrackPoint)localObject).setOnAvatarOnClickListener(null);
      ((TrackPoint)localObject).setOnLocationOnClickListener(null);
      ((TrackPoint)localObject).bKE();
    }
    while (true)
    {
      ((TrackPoint)localObject).setAvatar(localm.nKI.vHl);
      localStringBuffer.append("[view is null new one: " + localObject.hashCode() + " ] ");
      localm.nNP = new TrackPointAnimAvatar(localm.mContext);
      break;
      ((TrackPoint)localObject).setOnAvatarOnClickListener(localm.nOd);
      ((TrackPoint)localObject).setOnLocationOnClickListener(localm.nOc);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.m.4
 * JD-Core Version:    0.6.2
 */