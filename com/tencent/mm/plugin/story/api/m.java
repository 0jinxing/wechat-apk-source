package com.tencent.mm.plugin.story.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.ui.MMFragment;

public abstract interface m
{
  public abstract AbsStoryGallery a(Context paramContext, m.a parama, String paramString);

  public abstract void d(ViewGroup paramViewGroup, View paramView);

  public abstract AbsStoryMuteView eV(Context paramContext);

  public abstract i eW(Context paramContext);

  public abstract void ee(View paramView);

  public abstract void ef(View paramView);

  public abstract void eg(View paramView);

  public abstract MMFragment instantiateAlbumFragment(Context paramContext, Bundle paramBundle);

  public abstract Drawable ls(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.m
 * JD-Core Version:    0.6.2
 */