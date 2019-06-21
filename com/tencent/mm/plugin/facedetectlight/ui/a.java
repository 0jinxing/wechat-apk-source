package com.tencent.mm.plugin.facedetectlight.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class a
{
  protected ViewGroup BE;
  public String TAG = "FaceReflectBaseUI";
  protected com.tencent.mm.plugin.facedetectlight.ui.container.a mds;

  public a(ViewGroup paramViewGroup, com.tencent.mm.plugin.facedetectlight.ui.container.a parama)
  {
    this.BE = paramViewGroup;
    this.mds = parama;
    this.TAG = getClass().getSimpleName();
    LayoutInflater.from(this.BE.getContext()).inflate(btU(), this.BE, true);
    initView();
  }

  public abstract int btU();

  public final View findViewById(int paramInt)
  {
    return this.BE.findViewById(paramInt);
  }

  public abstract void initView();

  public final void setVisibility(int paramInt)
  {
    this.BE.setVisibility(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.a
 * JD-Core Version:    0.6.2
 */