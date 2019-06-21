package com.tencent.rtmp.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.liteav.k;
import com.tencent.liteav.renderer.TXCFocusIndicatorView;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TXCloudVideoView extends FrameLayout
  implements View.OnTouchListener
{
  private static final int FOCUS_AREA_SIZE_DP = 70;
  private static final String TAG = "TXCloudVideoView";
  private k mCapture;
  private int mCurrentScale;
  private boolean mFocus;
  private int mFocusAreaSize;
  private TXCFocusIndicatorView mFocusIndicatorView;
  private TXCGLSurfaceView mGLSurfaceView;
  private TXLogView mLogView;
  private ScaleGestureDetector mScaleGestureDetector;
  private ScaleGestureDetector.OnScaleGestureListener mScaleGestureListener;
  private TXCloudVideoView.a mTouchFocusRunnable;
  private TextureView mVideoView;
  private boolean mZoom;

  public TXCloudVideoView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TXCloudVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(65570);
    this.mFocusAreaSize = 0;
    this.mFocus = false;
    this.mZoom = false;
    this.mCurrentScale = 1;
    this.mScaleGestureDetector = null;
    this.mScaleGestureListener = new TXCloudVideoView.3(this);
    this.mTouchFocusRunnable = new TXCloudVideoView.a(this, null);
    this.mLogView = new TXLogView(paramContext);
    this.mScaleGestureDetector = new ScaleGestureDetector(paramContext, this.mScaleGestureListener);
    AppMethodBeat.o(65570);
  }

  private int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3);
    while (true)
    {
      return paramInt3;
      if (paramInt1 < paramInt2)
        paramInt3 = paramInt2;
      else
        paramInt3 = paramInt1;
    }
  }

  private Rect getTouchRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    AppMethodBeat.i(65577);
    if ((this.mFocusAreaSize == 0) && (this.mGLSurfaceView != null))
      this.mFocusAreaSize = ((int)(70.0F * this.mGLSurfaceView.getResources().getDisplayMetrics().density + 0.5F));
    int i = Float.valueOf(this.mFocusAreaSize * paramFloat).intValue();
    paramInt1 = clamp(paramInt1 - i / 2, 0, paramInt3 - i);
    paramInt2 = clamp(paramInt2 - i / 2, 0, paramInt4 - i);
    Rect localRect = new Rect(paramInt1, paramInt2, paramInt1 + i, i + paramInt2);
    AppMethodBeat.o(65577);
    return localRect;
  }

  public void addVideoView(TextureView paramTextureView)
  {
    AppMethodBeat.i(65572);
    if (this.mVideoView != null)
      removeView(this.mVideoView);
    this.mVideoView = paramTextureView;
    addView(this.mVideoView);
    removeView(this.mLogView);
    addView(this.mLogView);
    AppMethodBeat.o(65572);
  }

  public void addVideoView(TXCGLSurfaceView paramTXCGLSurfaceView)
  {
    AppMethodBeat.i(65571);
    if (this.mGLSurfaceView != null)
      removeView(this.mGLSurfaceView);
    this.mGLSurfaceView = paramTXCGLSurfaceView;
    addView(this.mGLSurfaceView);
    removeView(this.mLogView);
    addView(this.mLogView);
    AppMethodBeat.o(65571);
  }

  public void adjustVideoSize()
  {
  }

  public void clearLastFrame(boolean paramBoolean)
  {
    AppMethodBeat.i(65575);
    if (paramBoolean)
      setVisibility(8);
    AppMethodBeat.o(65575);
  }

  public void clearLog()
  {
    AppMethodBeat.i(65580);
    this.mLogView.a();
    AppMethodBeat.o(65580);
  }

  public void disableLog(boolean paramBoolean)
  {
    AppMethodBeat.i(65578);
    this.mLogView.b(paramBoolean);
    AppMethodBeat.o(65578);
  }

  public void enableHardwareDecode(boolean paramBoolean)
  {
  }

  public TXCGLSurfaceView getGLSurfaceView()
  {
    return this.mGLSurfaceView;
  }

  public TextureView getHWVideoView()
  {
    return this.mVideoView;
  }

  public TextureView getVideoView()
  {
    return this.mVideoView;
  }

  public void onDestroy()
  {
  }

  public void onPause()
  {
  }

  public void onResume()
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(65585);
    if ((paramMotionEvent.getPointerCount() == 1) && (paramMotionEvent.getAction() == 0))
    {
      this.mTouchFocusRunnable.a(paramView);
      this.mTouchFocusRunnable.a(paramMotionEvent);
      postDelayed(this.mTouchFocusRunnable, 100L);
    }
    while (true)
    {
      if ((this.mZoom) && (paramMotionEvent.getAction() == 0))
        performClick();
      boolean bool = this.mZoom;
      AppMethodBeat.o(65585);
      return bool;
      if ((paramMotionEvent.getPointerCount() > 1) && (paramMotionEvent.getAction() == 2))
      {
        removeCallbacks(this.mTouchFocusRunnable);
        onTouchFocus(-1, -1);
        if ((this.mScaleGestureDetector != null) && (this.mZoom))
          this.mScaleGestureDetector.onTouchEvent(paramMotionEvent);
      }
    }
  }

  public void onTouchFocus(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65576);
    if (this.mGLSurfaceView == null)
      AppMethodBeat.o(65576);
    while (true)
    {
      return;
      if ((paramInt1 < 0) || (paramInt2 < 0))
      {
        if (this.mFocusIndicatorView != null)
          this.mFocusIndicatorView.setVisibility(8);
        AppMethodBeat.o(65576);
      }
      else
      {
        if (this.mFocusIndicatorView == null)
        {
          this.mFocusIndicatorView = new TXCFocusIndicatorView(getContext());
          this.mFocusIndicatorView.setVisibility(0);
          addView(this.mFocusIndicatorView);
        }
        Rect localRect = getTouchRect(paramInt1, paramInt2, this.mGLSurfaceView.getWidth(), this.mGLSurfaceView.getHeight(), 1.0F);
        this.mFocusIndicatorView.show(localRect.left, localRect.top, localRect.right - localRect.left);
        AppMethodBeat.o(65576);
      }
    }
  }

  public void refreshLastFrame()
  {
  }

  public void removeFocusIndicatorView()
  {
    AppMethodBeat.i(65574);
    if (this.mFocusIndicatorView != null)
    {
      removeView(this.mFocusIndicatorView);
      this.mFocusIndicatorView = null;
    }
    AppMethodBeat.o(65574);
  }

  public void removeVideoView()
  {
    AppMethodBeat.i(65573);
    if (this.mVideoView != null)
    {
      removeView(this.mVideoView);
      this.mVideoView = null;
    }
    if (this.mGLSurfaceView != null)
    {
      removeView(this.mGLSurfaceView);
      this.mGLSurfaceView = null;
    }
    AppMethodBeat.o(65573);
  }

  public void setGLOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
  }

  public void setLogMargin(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(65582);
    Object localObject = this.mLogView.getLayoutParams();
    if (localObject != null);
    for (localObject = (FrameLayout.LayoutParams)localObject; ; localObject = new FrameLayout.LayoutParams(-1, -1))
    {
      ((FrameLayout.LayoutParams)localObject).leftMargin = TXLogView.a(getContext(), paramInt1);
      ((FrameLayout.LayoutParams)localObject).rightMargin = TXLogView.a(getContext(), paramInt2);
      ((FrameLayout.LayoutParams)localObject).topMargin = TXLogView.a(getContext(), paramInt3);
      ((FrameLayout.LayoutParams)localObject).bottomMargin = TXLogView.a(getContext(), paramInt4);
      this.mLogView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      AppMethodBeat.o(65582);
      return;
    }
  }

  public void setLogText(Bundle paramBundle1, Bundle paramBundle2, int paramInt)
  {
    AppMethodBeat.i(65581);
    this.mLogView.a(paramBundle1, paramBundle2, paramInt);
    AppMethodBeat.o(65581);
  }

  public void setMirror(boolean paramBoolean)
  {
  }

  public void setRenderMode(int paramInt)
  {
  }

  public void setRenderRotation(int paramInt)
  {
  }

  public void setStreamUrl(String paramString)
  {
  }

  public void setSurfaceTextureListener(TextureView.SurfaceTextureListener paramSurfaceTextureListener)
  {
  }

  public void setUseBeautyView(boolean paramBoolean)
  {
  }

  public void showLog(boolean paramBoolean)
  {
    AppMethodBeat.i(65579);
    this.mLogView.a(paramBoolean);
    AppMethodBeat.o(65579);
  }

  public void start(boolean paramBoolean1, boolean paramBoolean2, k paramk)
  {
    AppMethodBeat.i(65583);
    this.mFocus = paramBoolean1;
    this.mZoom = paramBoolean2;
    if ((this.mFocus) || (this.mZoom))
    {
      setOnTouchListener(this);
      this.mCapture = paramk;
    }
    post(new TXCloudVideoView.1(this));
    AppMethodBeat.o(65583);
  }

  public void stop(boolean paramBoolean)
  {
    AppMethodBeat.i(65584);
    if ((this.mFocus) || (this.mZoom))
      setOnTouchListener(null);
    this.mCapture = null;
    if (paramBoolean)
      post(new TXCloudVideoView.2(this));
    AppMethodBeat.o(65584);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.ui.TXCloudVideoView
 * JD-Core Version:    0.6.2
 */