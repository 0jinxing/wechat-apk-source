package com.tencent.youtu.ytagreflectlivecheck.controller;

import android.graphics.ColorMatrixColorFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytagreflectlivecheck.jni.JNIUtils;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.manager.ProcessManager.ProcessResult;
import com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker;
import com.tencent.youtu.ytcommon.tools.YTException;
import com.tencent.youtu.ytcommon.tools.YTLogger;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ReflectController$2 extends TimerWorker
{
  ReflectController$2(ReflectController paramReflectController, long paramLong1, long paramLong2, int paramInt, JSONArray paramJSONArray)
  {
    super(paramLong1, paramLong2);
  }

  public void onFinish()
  {
    AppMethodBeat.i(123153);
    try
    {
      YTLogger.i("YoutuLightLiveCheck", "finish timer.");
      ReflectController.access$802(this.this$0, System.currentTimeMillis());
      ReflectController.access$700(this.this$0, ReflectController.DEFAULT_MATRIX_COLOR_FILTER);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("setColorMatrixColorFilter:");
      YTLogger.i("mCountDownTimer", System.currentTimeMillis() - ReflectController.access$800(this.this$0));
      ReflectController.access$900(this.this$0, 1);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("changeState:");
      YTLogger.i("mCountDownTimer", System.currentTimeMillis() - ReflectController.access$800(this.this$0));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("current thread1: ");
      YTLogger.i("mCountDownTimer", Thread.currentThread());
      Timer localTimer = new java/util/Timer;
      localTimer.<init>();
      localObject = new com/tencent/youtu/ytagreflectlivecheck/controller/ReflectController$2$1;
      ((ReflectController.2.1)localObject).<init>(this);
      localTimer.schedule((TimerTask)localObject, 400L);
      ReflectController.access$1000(this.this$0);
      AppMethodBeat.o(123153);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        YTException.report(localException);
        ReflectController.access$1200(this.this$0).onFailed(ReflectController.access$1100(), "Finish check failed. ", "Check error report to get more information.");
        AppMethodBeat.o(123153);
      }
    }
  }

  public void onTick(long paramLong)
  {
    AppMethodBeat.i(123152);
    ReflectController.access$102(this.this$0, System.currentTimeMillis());
    YTLogger.i("mCountDownTimer", "unit:" + this.val$unit + " | real unit:" + (ReflectController.access$100(this.this$0) - ReflectController.access$200(this.this$0)));
    ReflectController.access$202(this.this$0, ReflectController.access$100(this.this$0));
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("startTimer.onTick. mFrame: ");
      YTLogger.d("YoutuLightLiveCheck", ReflectController.access$300(this.this$0));
      if (ReflectController.access$300(this.this$0) == ReflectController.access$400(this.this$0))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("change color begin. mFrame: ");
        YTLogger.i("YoutuLightLiveCheck", ReflectController.access$300(this.this$0));
        YTAGReflectLiveCheckJNIInterface.getInstance().FRSetBegin(JNIUtils.getTimeval());
      }
      while (true)
      {
        localObject = this.val$jsonArray.getJSONObject(ReflectController.access$300(this.this$0));
        float f1 = (float)((JSONObject)localObject).getDouble("R");
        float f2 = (float)((JSONObject)localObject).getDouble("G");
        float f3 = (float)((JSONObject)localObject).getDouble("B");
        float f4 = (float)((JSONObject)localObject).getDouble("A");
        ReflectController localReflectController = this.this$0;
        localObject = new android/graphics/ColorMatrixColorFilter;
        ((ColorMatrixColorFilter)localObject).<init>(new float[] { 0.0F, 0.0F, 0.0F, 0.0F, f1, 0.0F, 0.0F, 0.0F, 0.0F, f2, 0.0F, 0.0F, 0.0F, 0.0F, f3, 0.0F, 0.0F, 0.0F, f4, 0.0F });
        ReflectController.access$700(localReflectController, (ColorMatrixColorFilter)localObject);
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        ((ArrayList)localObject).add(Integer.valueOf((int)f1));
        ((ArrayList)localObject).add(Integer.valueOf((int)f2));
        ((ArrayList)localObject).add(Integer.valueOf((int)f3));
        ReflectController.access$308(this.this$0);
        AppMethodBeat.o(123152);
        return;
        if (ReflectController.access$300(this.this$0) != ReflectController.access$500(this.this$0))
          break;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("change color end. mFrame: ");
        YTLogger.i("YoutuLightLiveCheck", ReflectController.access$300(this.this$0));
        YTAGReflectLiveCheckJNIInterface.getInstance().FRSetEnd(JNIUtils.getTimeval());
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        YTException.report(localJSONException);
        AppMethodBeat.o(123152);
        continue;
        if (ReflectController.access$300(this.this$0) == ReflectController.access$600(this.this$0))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("change color point. mFrame: ");
          YTLogger.i("YoutuLightLiveCheck", ReflectController.access$300(this.this$0));
          YTAGReflectLiveCheckJNIInterface.getInstance().FRSetChangePointTime(JNIUtils.getTimeval());
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.controller.ReflectController.2
 * JD-Core Version:    0.6.2
 */