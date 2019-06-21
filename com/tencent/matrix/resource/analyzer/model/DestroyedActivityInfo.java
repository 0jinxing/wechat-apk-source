package com.tencent.matrix.resource.analyzer.model;

import android.app.Activity;
import java.lang.ref.WeakReference;

public class DestroyedActivityInfo
{
  public final String mActivityName;
  public final WeakReference<Activity> mActivityRef;
  public int mDetectedCount = 0;
  public final String mKey;
  public final long mLastCreatedActivityCount;

  public DestroyedActivityInfo(String paramString1, Activity paramActivity, String paramString2, long paramLong)
  {
    this.mKey = paramString1;
    this.mActivityName = paramString2;
    this.mActivityRef = new WeakReference(paramActivity);
    this.mLastCreatedActivityCount = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo
 * JD-Core Version:    0.6.2
 */