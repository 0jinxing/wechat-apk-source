package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.g.b;
import com.tencent.mm.plugin.story.g.c;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.ui.view.StoryCommentView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "commentView", "Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "getCommentView", "()Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "params", "Landroid/view/ViewGroup$LayoutParams;", "position", "getPosition", "()I", "setPosition", "(I)V", "postTipView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "getPostTipView", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "setPostTipView", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;)V", "thumbView", "Landroid/widget/ImageView;", "getThumbView", "()Landroid/widget/ImageView;", "videoItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "getVideoItem", "()Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "setVideoItem", "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;)V", "videoParams", "Landroid/widget/FrameLayout$LayoutParams;", "videoViewContainer", "Landroid/view/ViewGroup;", "videoViewMgr", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;", "changeVideoItem", "", "item", "getPlayStatus", "", "initPostTipView", "onDetachedFromWindow", "reBindBitmap", "setMute", "isMute", "setVideoViewMgr", "switchImageMode", "switchVideoMode", "plugin-story_release"})
public final class StoryGalleryItemView extends RelativeLayout
{
  final String TAG;
  final ImageView mmB;
  private final ViewGroup.LayoutParams oAD;
  int position;
  i rVZ;
  final StoryCommentView sfS;
  private StoryGalleryPostTip sfT;
  ViewGroup soW;
  final FrameLayout.LayoutParams soX;
  p soY;

  public StoryGalleryItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110768);
    this.TAG = "MircoMsg.StoryGalleryItemView";
    this.oAD = new ViewGroup.LayoutParams(-1, -1);
    this.soX = new FrameLayout.LayoutParams(-1, -1);
    setBackgroundColor(-16777216);
    this.soW = ((ViewGroup)new FrameLayout(paramContext));
    this.mmB = new ImageView(paramContext);
    this.mmB.setScaleType(ImageView.ScaleType.CENTER_CROP);
    addView((View)this.mmB, this.oAD);
    addView((View)this.soW, this.oAD);
    this.sfS = new StoryCommentView(paramContext);
    addView((View)this.sfS, this.oAD);
    paramContext = getContext();
    j.o(paramContext, "context");
    this.sfT = new StoryGalleryPostTip(paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, ak.de(getContext()) + ak.hF(getContext()));
    paramContext.addRule(10);
    addView((View)this.sfT, (ViewGroup.LayoutParams)paramContext);
    AppMethodBeat.o(110768);
  }

  public final void cCI()
  {
    AppMethodBeat.i(110766);
    ab.i(this.TAG, "switchVideoMode");
    Object localObject1 = this.soY;
    if (localObject1 != null)
      ((p)localObject1).a(this.soW, (ViewGroup.LayoutParams)this.soX);
    localObject1 = this.rVZ;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.soY;
      if (localObject2 != null)
        ((p)localObject2).o((i)localObject1);
    }
    this.soW.setVisibility(0);
    this.sfS.show();
    localObject1 = this.rVZ;
    if (localObject1 != null)
    {
      localObject2 = c.sbQ;
      c.ar(((i)localObject1).username, ((i)localObject1).rUJ);
      localObject2 = b.sbw;
      b.j(((i)localObject1).username, ((i)localObject1).rUJ, -1);
      AppMethodBeat.o(110766);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110766);
    }
  }

  public final boolean d(i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(110764);
    if (parami != null)
    {
      p localp = this.soY;
      if (localp != null)
      {
        j.p(parami, "item");
        if (localp.sqW != null)
        {
          parami = localp.sqW;
          if (parami != null)
            parami.isPlaying();
        }
        parami = Boolean.FALSE;
        if (parami == null)
          break label72;
        bool = parami.booleanValue();
        AppMethodBeat.o(110764);
      }
    }
    while (true)
    {
      return bool;
      parami = null;
      break;
      label72: AppMethodBeat.o(110764);
      continue;
      AppMethodBeat.o(110764);
    }
  }

  public final StoryCommentView getCommentView()
  {
    return this.sfS;
  }

  public final int getPosition()
  {
    return this.position;
  }

  public final StoryGalleryPostTip getPostTipView()
  {
    return this.sfT;
  }

  public final String getTAG()
  {
    return this.TAG;
  }

  public final ImageView getThumbView()
  {
    return this.mmB;
  }

  public final i getVideoItem()
  {
    return this.rVZ;
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(110767);
    ab.d(this.TAG, "onDetachedFromWindow");
    super.onDetachedFromWindow();
    this.soY = null;
    AppMethodBeat.o(110767);
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(110765);
    p localp = this.soY;
    if (localp != null)
    {
      localp.setMute(paramBoolean);
      AppMethodBeat.o(110765);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110765);
    }
  }

  public final void setPosition(int paramInt)
  {
    this.position = paramInt;
  }

  public final void setPostTipView(StoryGalleryPostTip paramStoryGalleryPostTip)
  {
    this.sfT = paramStoryGalleryPostTip;
  }

  public final void setVideoItem(i parami)
  {
    this.rVZ = parami;
  }

  public final void setVideoViewMgr(p paramp)
  {
    this.soY = paramp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView
 * JD-Core Version:    0.6.2
 */