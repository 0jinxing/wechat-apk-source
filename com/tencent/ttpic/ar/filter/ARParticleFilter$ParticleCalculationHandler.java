package com.tencent.ttpic.ar.filter;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.oscarcamera.particlesystem.FrameParticleData;
import com.tencent.oscarcamera.particlesystem.ParticleSystemEx;
import com.tencent.oscarcamera.particlesystem.Sprite;
import java.io.File;
import java.util.List;

class ARParticleFilter$ParticleCalculationHandler extends Handler
{
  public boolean isStopped = false;

  public ARParticleFilter$ParticleCalculationHandler(ARParticleFilter paramARParticleFilter, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(81653);
    if (this.isStopped)
      AppMethodBeat.o(81653);
    while (true)
    {
      return;
      int i = paramMessage.what;
      ARParticleFilter.FrameData localFrameData = new ARParticleFilter.FrameData(this.this$0);
      List localList = ARParticleFilter.access$600(this.this$0).advance();
      if (localList == null)
      {
        AppMethodBeat.o(81653);
      }
      else
      {
        for (int j = 0; (j < localList.size()) && (j < ARParticleFilter.access$100(this.this$0).size()) && (j < ARParticleFilter.access$200(this.this$0).size()); j++)
        {
          FrameParticleData localFrameParticleData = (FrameParticleData)localList.get(j);
          paramMessage = (Sprite)ARParticleFilter.access$100(this.this$0).get(j);
          ARParticleFilter.FrameParticleData localFrameParticleData1 = new ARParticleFilter.FrameParticleData(this.this$0);
          localFrameParticleData1.blendMode = localFrameParticleData.blendMode;
          localFrameParticleData1.particleCount = localFrameParticleData.particleCount;
          localFrameParticleData1.tex = paramMessage.path;
          localFrameParticleData1.positionIndex = localFrameParticleData.positionIndex;
          localFrameParticleData1.particleCenter = localFrameParticleData.particleCenter;
          localFrameParticleData1.particleSize = localFrameParticleData.particleSize;
          localFrameParticleData1.texCoords = localFrameParticleData.texCoords;
          localFrameParticleData1.particleColor = localFrameParticleData.particleColor;
          localFrameParticleData1.audioPath = (ARParticleFilter.access$700(this.this$0) + File.separator + (String)ARParticleFilter.access$200(this.this$0).get(j) + File.separator + paramMessage.audioPath);
          if ((!localFrameData.needPlayMusic) && (!TextUtils.isEmpty(localFrameParticleData.audioPath)))
            localFrameData.needPlayMusic = localFrameParticleData.playAudio;
          localFrameData.frameParticleData.add(localFrameParticleData1);
        }
        ARParticleFilter.access$800(this.this$0)[i] = localFrameData;
        ARParticleFilter.access$800(this.this$0)[i].ready = true;
        AppMethodBeat.o(81653);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.ar.filter.ARParticleFilter.ParticleCalculationHandler
 * JD-Core Version:    0.6.2
 */