package com.tencent.ttpic.ar.filter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.oscarcamera.particlesystem.Sprite;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class ARParticleFilter$BitmapDecodeTask extends AsyncTask<Void, Void, Void>
{
  ARParticleFilter$BitmapDecodeTask(ARParticleFilter paramARParticleFilter)
  {
  }

  private void preCalTexCoords(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(81649);
    int i = paramInt3 / paramInt5;
    int j = paramInt2 / paramInt4;
    float f1 = paramInt4 * 1.0F / paramInt2;
    float f2 = paramInt5 * 1.0F / paramInt3;
    ARParticleFilter.access$000(this.this$0).add(paramInt1, new ArrayList());
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
      for (paramInt3 = 0; paramInt3 < j; paramInt3++)
      {
        PointF localPointF1 = new PointF(paramInt3 * f1, paramInt2 * f2);
        PointF localPointF2 = new PointF(localPointF1.x, localPointF1.y + f2);
        PointF localPointF3 = new PointF(localPointF1.x + f1, localPointF1.y);
        PointF localPointF4 = new PointF(localPointF3.x, localPointF1.y + f2);
        ARParticleFilter.TexCoord localTexCoord = new ARParticleFilter.TexCoord(this.this$0);
        localTexCoord.texCoord[0] = localPointF3.x;
        localTexCoord.texCoord[1] = localPointF3.y;
        localTexCoord.texCoord[2] = localPointF4.x;
        localTexCoord.texCoord[3] = localPointF4.y;
        localTexCoord.texCoord[4] = localPointF2.x;
        localTexCoord.texCoord[5] = localPointF2.y;
        localTexCoord.texCoord[6] = localPointF3.x;
        localTexCoord.texCoord[7] = localPointF3.y;
        localTexCoord.texCoord[8] = localPointF2.x;
        localTexCoord.texCoord[9] = localPointF2.y;
        localTexCoord.texCoord[10] = localPointF1.x;
        localTexCoord.texCoord[11] = localPointF1.y;
        ((ArrayList)ARParticleFilter.access$000(this.this$0).get(paramInt1)).add(localTexCoord);
      }
    AppMethodBeat.o(81649);
  }

  protected Void doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(81650);
    if ((ARParticleFilter.access$100(this.this$0) != null) && (ARParticleFilter.access$200(this.this$0) != null))
    {
      int i = 0;
      if ((i < ARParticleFilter.access$100(this.this$0).size()) && (i < ARParticleFilter.access$200(this.this$0).size()))
      {
        Sprite localSprite = (Sprite)ARParticleFilter.access$100(this.this$0).get(i);
        paramArrayOfVoid = ARParticleFilter.access$300(this.this$0) + File.separator + (String)ARParticleFilter.access$200(this.this$0).get(i) + File.separator + localSprite.path;
        if (paramArrayOfVoid.startsWith("assets://"));
        for (paramArrayOfVoid = BitmapUtils.decodeSampledBitmapFromAssets(VideoGlobalContext.getContext(), FileUtils.getRealPath(paramArrayOfVoid), 2147483647, 2147483647); ; paramArrayOfVoid = BitmapUtils.decodeSampledBitmapFromFile(paramArrayOfVoid, 2147483647, 2147483647))
        {
          if (ARParticleFilter.access$400(this.this$0, paramArrayOfVoid))
          {
            preCalTexCoords(i, paramArrayOfVoid.getWidth(), paramArrayOfVoid.getHeight(), localSprite.width, localSprite.height);
            ARParticleFilter.access$500(this.this$0)[i] = paramArrayOfVoid;
          }
          i++;
          break;
        }
      }
    }
    AppMethodBeat.o(81650);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.ar.filter.ARParticleFilter.BitmapDecodeTask
 * JD-Core Version:    0.6.2
 */