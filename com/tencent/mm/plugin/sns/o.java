package com.tencent.mm.plugin.sns;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.storage.az;
import java.util.LinkedList;

public final class o
  implements m
{
  public final void a(long paramLong, ImageView paramImageView, int paramInt)
  {
    AppMethodBeat.i(35639);
    Object localObject = af.cnF().kD(paramLong);
    if (localObject == null)
      AppMethodBeat.o(35639);
    while (true)
    {
      return;
      localObject = ((n)localObject).cqu();
      if (((TimeLineObject)localObject).xfI.wbK.size() > 0)
      {
        localObject = (bau)((TimeLineObject)localObject).xfI.wbK.get(0);
        Bitmap localBitmap = af.cnC().b((bau)localObject);
        if (localBitmap != null)
        {
          paramImageView.setImageBitmap(localBitmap);
          AppMethodBeat.o(35639);
        }
        else
        {
          af.cnC().b((bau)localObject, paramImageView, paramInt, az.xYU);
        }
      }
      else
      {
        AppMethodBeat.o(35639);
      }
    }
  }

  public final boolean jM(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(35638);
    n localn = af.cnF().kD(paramLong);
    if (localn == null)
      AppMethodBeat.o(35638);
    while (true)
    {
      return bool;
      if (localn.cqu().xfI.wbK.size() > 0)
      {
        bool = true;
        AppMethodBeat.o(35638);
      }
      else
      {
        AppMethodBeat.o(35638);
      }
    }
  }

  public final TimeLineObject tC(String paramString)
  {
    AppMethodBeat.i(35637);
    paramString = e.tC(paramString);
    AppMethodBeat.o(35637);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.o
 * JD-Core Version:    0.6.2
 */