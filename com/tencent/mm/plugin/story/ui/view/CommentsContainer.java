package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentsContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "comments", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "currIndex", "isPause", "", "()Z", "setPause", "(Z)V", "itemClickListener", "Lkotlin/Function0;", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function0;", "setItemClickListener", "(Lkotlin/jvm/functions/Function0;)V", "nextItemDelay", "", "nextItemDuration", "nextRunnable", "Ljava/lang/Runnable;", "onLoop", "getOnLoop", "setOnLoop", "onLoopRunnable", "random", "Ljava/util/Random;", "animNext", "getItemView", "Lcom/tencent/mm/plugin/story/ui/view/CommentItemView;", "comment", "nextDelay", "nextDuration", "pause", "restart", "resume", "shakeIndex", "index", "update", "storyComments", "", "Companion", "plugin-story_release"})
public final class CommentsContainer extends RelativeLayout
{
  public static final a siP;
  private final String TAG;
  boolean cAY;
  private int eUk;
  private Random random;
  private final ArrayList<com.tencent.mm.plugin.story.model.b.a> seM;
  private long siJ;
  private long siK;
  private a.f.a.a<y> siL;
  private a.f.a.a<y> siM;
  private final Runnable siN;
  private final Runnable siO;

  static
  {
    AppMethodBeat.i(110375);
    siP = new a((byte)0);
    AppMethodBeat.o(110375);
  }

  public CommentsContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110374);
    AppMethodBeat.o(110374);
  }

  public CommentsContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110373);
    this.TAG = "MicroMsg.CommentsContainer";
    this.seM = new ArrayList();
    this.eUk = -1;
    this.random = new Random();
    this.cAY = true;
    this.siN = ((Runnable)new CommentsContainer.d(this));
    this.siO = ((Runnable)new CommentsContainer.e(this));
    AppMethodBeat.o(110373);
  }

  public final void dI(List<com.tencent.mm.plugin.story.model.b.a> paramList)
  {
    AppMethodBeat.i(110370);
    j.p(paramList, "storyComments");
    this.seM.clear();
    this.seM.addAll((Collection)paramList);
    this.eUk = -1;
    this.siK = 4000L;
    AppMethodBeat.o(110370);
  }

  public final a.f.a.a<y> getItemClickListener()
  {
    return this.siL;
  }

  public final a.f.a.a<y> getOnLoop()
  {
    return this.siM;
  }

  public final void pause()
  {
    AppMethodBeat.i(110372);
    ab.i(this.TAG, "LogStory: pause ".concat(String.valueOf(this)));
    this.cAY = true;
    removeCallbacks(this.siN);
    removeCallbacks(this.siO);
    removeAllViews();
    this.eUk = -1;
    AppMethodBeat.o(110372);
  }

  public final void restart()
  {
    AppMethodBeat.i(138896);
    ab.i(this.TAG, "LogStory: restart ".concat(String.valueOf(this)));
    resume();
    AppMethodBeat.o(138896);
  }

  public final void resume()
  {
    AppMethodBeat.i(110371);
    ab.i(this.TAG, "LogStory: resume ".concat(String.valueOf(this)));
    this.cAY = false;
    if (this.eUk != 0)
    {
      removeCallbacks(this.siN);
      removeCallbacks(this.siO);
      removeAllViews();
      this.eUk = -1;
      postDelayed(this.siN, 300L);
    }
    AppMethodBeat.o(110371);
  }

  public final void setItemClickListener(a.f.a.a<y> parama)
  {
    this.siL = parama;
  }

  public final void setOnLoop(a.f.a.a<y> parama)
  {
    this.siM = parama;
  }

  public final void setPause(boolean paramBoolean)
  {
    this.cAY = paramBoolean;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentsContainer$Companion;", "", "()V", "createDrawable", "Landroid/graphics/drawable/GradientDrawable;", "context", "Landroid/content/Context;", "comment", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "plugin-story_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentsContainer
 * JD-Core Version:    0.6.2
 */