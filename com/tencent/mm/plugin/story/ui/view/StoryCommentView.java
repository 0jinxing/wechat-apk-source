package com.tencent.mm.plugin.story.ui.view;

import a.f.a.m;
import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.ak;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/story/contract/CommentContract$IView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarConfetti", "Lcom/tencent/mm/plugin/luckymoney/particles/ConfettiManager;", "avatarConfettiIndex", "avatarGenerator", "Lcom/tencent/mm/plugin/luckymoney/particles/ConfettiGenerator;", "avatarMap", "Ljava/util/LinkedHashMap;", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "Landroid/graphics/drawable/LayerDrawable;", "Lkotlin/collections/LinkedHashMap;", "commentAdapter", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter;", "commentClickHelper", "Lcom/tencent/mm/plugin/story/ui/view/ViewClickHelper;", "commentData", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;", "commentDialog", "Lcom/tencent/mm/plugin/story/ui/view/CommentInputDialog;", "commentHint", "Landroid/widget/TextView;", "commentInputCallback", "Lkotlin/Function2;", "", "", "", "commentInputSuccess", "commentOtherGroup", "Landroid/view/View;", "commentOthersBubbleIv", "Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;", "commentOthersInputIv", "commentRecycler", "Landroid/support/v7/widget/RecyclerView;", "commentSelfActionIv", "commentSelfGroup", "contentView", "currState", "generator", "hasConfetti", "hideHintRunnable", "Ljava/lang/Runnable;", "isBubbled", "isContact", "isSelf", "itemContainer", "Lcom/tencent/mm/plugin/story/ui/view/CommentsContainer;", "maskView", "outsideClickListener", "Lkotlin/Function0;", "getOutsideClickListener", "()Lkotlin/jvm/functions/Function0;", "setOutsideClickListener", "(Lkotlin/jvm/functions/Function0;)V", "replyCommentId", "saveContent", "", "sessionId", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "smallConfetti", "smallGenerator", "stateChangeCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "getStateChangeCallback", "()Lkotlin/jvm/functions/Function1;", "setStateChangeCallback", "(Lkotlin/jvm/functions/Function1;)V", "storyId", "", "storyOwner", "toUser", "destroy", "emitClickBubble", "hide", "hideItemContainer", "onBack", "pause", "postBubble", "isBtn", "resume", "setup", "comment", "scene", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;", "story", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "show", "showBubbleHint", "showItemContainer", "switchImageMode", "switchState", "switchVideoMode", "toggleActiveState", "active", "Companion", "plugin-story_release"})
public final class StoryCommentView extends RelativeLayout
{
  private static final String TAG = "MicroMsg.StoryCommentView";
  private static final int[] sjN;
  public static final StoryCommentView.a sjO;
  private final View contentView;
  private String cvF;
  public boolean czr;
  private int fnH;
  private final View iVh;
  private final Runnable lmq;
  public long rUJ;
  public String rVl;
  public int rVm;
  private final RecyclerView seK;
  public boolean sjA;
  private c sjB;
  private boolean sjC;
  public CharSequence sjD;
  private final com.tencent.mm.plugin.luckymoney.particles.b sjE;
  private final com.tencent.mm.plugin.luckymoney.particles.b sjF;
  private com.tencent.mm.plugin.luckymoney.particles.b sjG;
  private boolean sjH;
  private int sjI;
  private final LinkedHashMap<com.tencent.mm.plugin.story.model.b.a, LayerDrawable> sjJ;
  public final h sjK;
  private a.f.a.b<? super Integer, y> sjL;
  private a.f.a.a<Boolean> sjM;
  private final m<String, Boolean, y> sjn;
  public final CommentsContainer sjq;
  public final com.tencent.mm.plugin.story.ui.a.f sjr;
  private final TextView sjs;
  private final StoryCommentBubbleView sjt;
  private final StoryCommentBubbleView sju;
  private final StoryCommentBubbleView sjv;
  public final View sjw;
  public final View sjx;
  public boolean sjy;
  public com.tencent.mm.plugin.story.model.d.f sjz;
  public String toUser;

  static
  {
    AppMethodBeat.i(110437);
    sjO = new StoryCommentView.a((byte)0);
    TAG = "MicroMsg.StoryCommentView";
    sjN = new int[] { -372399, -352965, -15616, -7220480, -16268960, -15683841, -15432210, -10197008 };
    AppMethodBeat.o(110437);
  }

  public StoryCommentView(Context paramContext)
  {
    this(paramContext, null);
    AppMethodBeat.i(110436);
    AppMethodBeat.o(110436);
  }

  public StoryCommentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110435);
    AppMethodBeat.o(110435);
  }

  public StoryCommentView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 213
    //   3: invokestatic 219	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: aload_1
    //   8: aload_2
    //   9: iload_3
    //   10: invokespecial 226	android/widget/RelativeLayout:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   13: ldc 227
    //   15: invokestatic 191	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   18: aload_0
    //   19: ldc 228
    //   21: putfield 230	com/tencent/mm/plugin/story/ui/view/StoryCommentView:rVl	Ljava/lang/String;
    //   24: aload_0
    //   25: new 232	com/tencent/mm/plugin/story/model/d/f
    //   28: dup
    //   29: invokespecial 234	com/tencent/mm/plugin/story/model/d/f:<init>	()V
    //   32: putfield 236	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjz	Lcom/tencent/mm/plugin/story/model/d/f;
    //   35: aload_0
    //   36: iconst_2
    //   37: putfield 238	com/tencent/mm/plugin/story/ui/view/StoryCommentView:fnH	I
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield 240	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjH	Z
    //   45: aload_0
    //   46: ldc 228
    //   48: putfield 242	com/tencent/mm/plugin/story/ui/view/StoryCommentView:toUser	Ljava/lang/String;
    //   51: aload_0
    //   52: new 244	java/util/LinkedHashMap
    //   55: dup
    //   56: invokespecial 245	java/util/LinkedHashMap:<init>	()V
    //   59: putfield 247	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjJ	Ljava/util/LinkedHashMap;
    //   62: aload_1
    //   63: ldc 248
    //   65: aload_0
    //   66: checkcast 250	android/view/ViewGroup
    //   69: invokestatic 256	android/view/View:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   72: pop
    //   73: aload_0
    //   74: ldc_w 257
    //   77: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   80: astore_2
    //   81: aload_2
    //   82: ldc_w 263
    //   85: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   88: aload_0
    //   89: aload_2
    //   90: checkcast 267	com/tencent/mm/plugin/story/ui/view/CommentsContainer
    //   93: putfield 269	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjq	Lcom/tencent/mm/plugin/story/ui/view/CommentsContainer;
    //   96: aload_0
    //   97: ldc_w 270
    //   100: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   103: astore_2
    //   104: aload_2
    //   105: ldc_w 272
    //   108: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   111: aload_0
    //   112: aload_2
    //   113: checkcast 274	android/support/v7/widget/RecyclerView
    //   116: putfield 276	com/tencent/mm/plugin/story/ui/view/StoryCommentView:seK	Landroid/support/v7/widget/RecyclerView;
    //   119: aload_0
    //   120: ldc_w 277
    //   123: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   126: astore_2
    //   127: aload_2
    //   128: ldc_w 279
    //   131: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   134: aload_0
    //   135: aload_2
    //   136: putfield 281	com/tencent/mm/plugin/story/ui/view/StoryCommentView:iVh	Landroid/view/View;
    //   139: aload_0
    //   140: ldc_w 282
    //   143: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   146: astore_2
    //   147: aload_2
    //   148: ldc_w 284
    //   151: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   154: aload_0
    //   155: aload_2
    //   156: checkcast 286	android/widget/TextView
    //   159: putfield 288	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjs	Landroid/widget/TextView;
    //   162: aload_0
    //   163: ldc_w 289
    //   166: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   169: astore_2
    //   170: aload_2
    //   171: ldc_w 291
    //   174: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   177: aload_0
    //   178: aload_2
    //   179: putfield 293	com/tencent/mm/plugin/story/ui/view/StoryCommentView:contentView	Landroid/view/View;
    //   182: aload_0
    //   183: ldc_w 294
    //   186: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   189: astore_2
    //   190: aload_2
    //   191: ldc_w 296
    //   194: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   197: aload_0
    //   198: aload_2
    //   199: checkcast 298	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView
    //   202: putfield 300	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjt	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   205: aload_0
    //   206: ldc_w 301
    //   209: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   212: astore_2
    //   213: aload_2
    //   214: ldc_w 303
    //   217: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   220: aload_0
    //   221: aload_2
    //   222: checkcast 298	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView
    //   225: putfield 305	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sju	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   228: aload_0
    //   229: ldc_w 306
    //   232: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   235: astore_2
    //   236: aload_2
    //   237: ldc_w 308
    //   240: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   243: aload_0
    //   244: aload_2
    //   245: checkcast 298	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView
    //   248: putfield 310	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjv	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   251: aload_0
    //   252: ldc_w 311
    //   255: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   258: astore_2
    //   259: aload_2
    //   260: ldc_w 313
    //   263: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   266: aload_0
    //   267: aload_2
    //   268: putfield 315	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjw	Landroid/view/View;
    //   271: aload_0
    //   272: ldc_w 316
    //   275: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   278: astore_2
    //   279: aload_2
    //   280: ldc_w 318
    //   283: invokestatic 265	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   286: aload_0
    //   287: aload_2
    //   288: putfield 320	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjx	Landroid/view/View;
    //   291: aload_0
    //   292: getfield 288	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjs	Landroid/widget/TextView;
    //   295: invokestatic 326	com/tencent/mm/ab/b:f	(Landroid/widget/TextView;)V
    //   298: aload_0
    //   299: getfield 281	com/tencent/mm/plugin/story/ui/view/StoryCommentView:iVh	Landroid/view/View;
    //   302: bipush 8
    //   304: invokevirtual 329	android/view/View:setVisibility	(I)V
    //   307: aload_0
    //   308: getfield 269	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjq	Lcom/tencent/mm/plugin/story/ui/view/CommentsContainer;
    //   311: new 331	com/tencent/mm/plugin/story/ui/view/StoryCommentView$1
    //   314: dup
    //   315: aload_0
    //   316: invokespecial 334	com/tencent/mm/plugin/story/ui/view/StoryCommentView$1:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   319: checkcast 336	a/f/a/a
    //   322: invokevirtual 340	com/tencent/mm/plugin/story/ui/view/CommentsContainer:setItemClickListener	(La/f/a/a;)V
    //   325: aload_0
    //   326: getfield 300	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjt	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   329: aload_1
    //   330: ldc_w 341
    //   333: iconst_m1
    //   334: invokestatic 346	com/tencent/mm/ui/ah:f	(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;
    //   337: invokevirtual 350	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   340: aload_0
    //   341: getfield 310	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjv	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   344: aload_1
    //   345: ldc_w 341
    //   348: iconst_m1
    //   349: invokestatic 346	com/tencent/mm/ui/ah:f	(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;
    //   352: invokevirtual 350	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   355: aload_0
    //   356: new 352	com/tencent/mm/plugin/story/ui/a/f
    //   359: dup
    //   360: invokespecial 353	com/tencent/mm/plugin/story/ui/a/f:<init>	()V
    //   363: putfield 355	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjr	Lcom/tencent/mm/plugin/story/ui/a/f;
    //   366: aload_0
    //   367: getfield 276	com/tencent/mm/plugin/story/ui/view/StoryCommentView:seK	Landroid/support/v7/widget/RecyclerView;
    //   370: new 357	android/support/v7/widget/LinearLayoutManager
    //   373: dup
    //   374: invokespecial 358	android/support/v7/widget/LinearLayoutManager:<init>	()V
    //   377: checkcast 360	android/support/v7/widget/RecyclerView$i
    //   380: invokevirtual 364	android/support/v7/widget/RecyclerView:setLayoutManager	(Landroid/support/v7/widget/RecyclerView$i;)V
    //   383: aload_0
    //   384: getfield 276	com/tencent/mm/plugin/story/ui/view/StoryCommentView:seK	Landroid/support/v7/widget/RecyclerView;
    //   387: aload_0
    //   388: getfield 355	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjr	Lcom/tencent/mm/plugin/story/ui/a/f;
    //   391: checkcast 366	android/support/v7/widget/RecyclerView$a
    //   394: invokevirtual 370	android/support/v7/widget/RecyclerView:setAdapter	(Landroid/support/v7/widget/RecyclerView$a;)V
    //   397: aload_0
    //   398: getfield 276	com/tencent/mm/plugin/story/ui/view/StoryCommentView:seK	Landroid/support/v7/widget/RecyclerView;
    //   401: bipush 8
    //   403: invokevirtual 371	android/support/v7/widget/RecyclerView:setVisibility	(I)V
    //   406: aload_0
    //   407: getfield 276	com/tencent/mm/plugin/story/ui/view/StoryCommentView:seK	Landroid/support/v7/widget/RecyclerView;
    //   410: iconst_0
    //   411: invokevirtual 375	android/support/v7/widget/RecyclerView:setFocusable	(Z)V
    //   414: aload_0
    //   415: getfield 355	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjr	Lcom/tencent/mm/plugin/story/ui/a/f;
    //   418: new 377	com/tencent/mm/plugin/story/ui/view/StoryCommentView$5
    //   421: dup
    //   422: aload_0
    //   423: invokespecial 378	com/tencent/mm/plugin/story/ui/view/StoryCommentView$5:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   426: checkcast 380	a/f/a/m
    //   429: putfield 383	com/tencent/mm/plugin/story/ui/a/f:sfI	La/f/a/m;
    //   432: aload_0
    //   433: invokevirtual 387	com/tencent/mm/plugin/story/ui/view/StoryCommentView:getResources	()Landroid/content/res/Resources;
    //   436: ldc_w 388
    //   439: invokestatic 394	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    //   442: astore_2
    //   443: aload_1
    //   444: bipush 48
    //   446: invokestatic 400	com/tencent/mm/bz/a:fromDPToPix	(Landroid/content/Context;I)I
    //   449: istore_3
    //   450: aload_2
    //   451: iload_3
    //   452: iload_3
    //   453: iconst_1
    //   454: invokestatic 406	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   457: astore_2
    //   458: aload_0
    //   459: new 408	com/tencent/mm/plugin/story/ui/view/StoryCommentView$6
    //   462: dup
    //   463: aload_2
    //   464: invokespecial 411	com/tencent/mm/plugin/story/ui/view/StoryCommentView$6:<init>	(Landroid/graphics/Bitmap;)V
    //   467: checkcast 413	com/tencent/mm/plugin/luckymoney/particles/b
    //   470: putfield 415	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjE	Lcom/tencent/mm/plugin/luckymoney/particles/b;
    //   473: aload_0
    //   474: new 417	com/tencent/mm/plugin/story/ui/view/StoryCommentView$7
    //   477: dup
    //   478: aload_2
    //   479: invokespecial 418	com/tencent/mm/plugin/story/ui/view/StoryCommentView$7:<init>	(Landroid/graphics/Bitmap;)V
    //   482: checkcast 413	com/tencent/mm/plugin/luckymoney/particles/b
    //   485: putfield 420	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjF	Lcom/tencent/mm/plugin/luckymoney/particles/b;
    //   488: aload_0
    //   489: new 422	com/tencent/mm/plugin/story/ui/view/StoryCommentView$8
    //   492: dup
    //   493: aload_0
    //   494: aload_1
    //   495: invokespecial 425	com/tencent/mm/plugin/story/ui/view/StoryCommentView$8:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;Landroid/content/Context;)V
    //   498: checkcast 413	com/tencent/mm/plugin/luckymoney/particles/b
    //   501: putfield 427	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjG	Lcom/tencent/mm/plugin/luckymoney/particles/b;
    //   504: aload_0
    //   505: new 8	com/tencent/mm/plugin/story/ui/view/StoryCommentView$9
    //   508: dup
    //   509: aload_0
    //   510: invokespecial 428	com/tencent/mm/plugin/story/ui/view/StoryCommentView$9:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   513: checkcast 430	java/lang/Runnable
    //   516: putfield 432	com/tencent/mm/plugin/story/ui/view/StoryCommentView:lmq	Ljava/lang/Runnable;
    //   519: aload_0
    //   520: getfield 300	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjt	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   523: new 434	com/tencent/mm/plugin/story/ui/view/StoryCommentView$10
    //   526: dup
    //   527: aload_0
    //   528: invokespecial 435	com/tencent/mm/plugin/story/ui/view/StoryCommentView$10:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   531: checkcast 437	android/view/View$OnClickListener
    //   534: invokevirtual 441	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   537: aload_0
    //   538: getfield 305	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sju	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   541: new 443	com/tencent/mm/plugin/story/ui/view/StoryCommentView$11
    //   544: dup
    //   545: aload_0
    //   546: invokespecial 444	com/tencent/mm/plugin/story/ui/view/StoryCommentView$11:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   549: checkcast 437	android/view/View$OnClickListener
    //   552: invokevirtual 441	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   555: aload_0
    //   556: getfield 310	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjv	Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;
    //   559: new 446	com/tencent/mm/plugin/story/ui/view/StoryCommentView$12
    //   562: dup
    //   563: aload_0
    //   564: invokespecial 447	com/tencent/mm/plugin/story/ui/view/StoryCommentView$12:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   567: checkcast 437	android/view/View$OnClickListener
    //   570: invokevirtual 441	com/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   573: aload_0
    //   574: new 449	com/tencent/mm/plugin/story/ui/view/h
    //   577: dup
    //   578: aload_0
    //   579: checkcast 252	android/view/View
    //   582: invokespecial 452	com/tencent/mm/plugin/story/ui/view/h:<init>	(Landroid/view/View;)V
    //   585: putfield 454	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjK	Lcom/tencent/mm/plugin/story/ui/view/h;
    //   588: aload_0
    //   589: getfield 454	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjK	Lcom/tencent/mm/plugin/story/ui/view/h;
    //   592: new 6	com/tencent/mm/plugin/story/ui/view/StoryCommentView$2
    //   595: dup
    //   596: aload_0
    //   597: invokespecial 455	com/tencent/mm/plugin/story/ui/view/StoryCommentView$2:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   600: checkcast 457	a/f/a/b
    //   603: putfield 460	com/tencent/mm/plugin/story/ui/view/h:skq	La/f/a/b;
    //   606: aload_0
    //   607: new 462	com/tencent/mm/plugin/story/ui/view/StoryCommentView$3
    //   610: dup
    //   611: aload_0
    //   612: invokespecial 463	com/tencent/mm/plugin/story/ui/view/StoryCommentView$3:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   615: checkcast 437	android/view/View$OnClickListener
    //   618: invokevirtual 464	com/tencent/mm/plugin/story/ui/view/StoryCommentView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   621: aload_0
    //   622: new 466	com/tencent/mm/plugin/story/ui/view/StoryCommentView$4
    //   625: dup
    //   626: aload_0
    //   627: invokespecial 467	com/tencent/mm/plugin/story/ui/view/StoryCommentView$4:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   630: checkcast 469	android/view/View$OnLongClickListener
    //   633: invokevirtual 473	com/tencent/mm/plugin/story/ui/view/StoryCommentView:setOnLongClickListener	(Landroid/view/View$OnLongClickListener;)V
    //   636: aload_1
    //   637: invokestatic 479	com/tencent/mm/ui/ak:fr	(Landroid/content/Context;)I
    //   640: istore_3
    //   641: getstatic 199	com/tencent/mm/plugin/story/ui/view/StoryCommentView:TAG	Ljava/lang/String;
    //   644: ldc_w 481
    //   647: iload_3
    //   648: invokestatic 487	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   651: invokevirtual 491	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   654: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   657: aload_0
    //   658: ldc_w 497
    //   661: invokevirtual 261	com/tencent/mm/plugin/story/ui/view/StoryCommentView:findViewById	(I)Landroid/view/View;
    //   664: iconst_0
    //   665: iconst_0
    //   666: iconst_0
    //   667: iload_3
    //   668: invokevirtual 501	android/view/View:setPadding	(IIII)V
    //   671: aload_0
    //   672: new 503	com/tencent/mm/plugin/story/ui/view/StoryCommentView$b
    //   675: dup
    //   676: aload_0
    //   677: invokespecial 504	com/tencent/mm/plugin/story/ui/view/StoryCommentView$b:<init>	(Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;)V
    //   680: checkcast 380	a/f/a/m
    //   683: putfield 506	com/tencent/mm/plugin/story/ui/view/StoryCommentView:sjn	La/f/a/m;
    //   686: ldc 227
    //   688: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   691: return
  }

  public static void pause()
  {
    AppMethodBeat.i(110428);
    ab.i(TAG, "LogStory: pause");
    AppMethodBeat.o(110428);
  }

  public static void resume()
  {
    AppMethodBeat.i(110427);
    ab.i(TAG, "LogStory: resume");
    AppMethodBeat.o(110427);
  }

  public final boolean Ab()
  {
    boolean bool = true;
    AppMethodBeat.i(110426);
    if (this.fnH == 1)
    {
      oE(2);
      AppMethodBeat.o(110426);
    }
    while (true)
    {
      return bool;
      if (this.fnH == 3)
      {
        oE(2);
        AppMethodBeat.o(110426);
      }
      else if (this.fnH == 5)
      {
        oE(2);
        AppMethodBeat.o(110426);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(110426);
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(138921);
    this.sjq.pause();
    this.sjJ.clear();
    AppMethodBeat.o(138921);
  }

  public final a.f.a.a<Boolean> getOutsideClickListener()
  {
    return this.sjM;
  }

  public final String getSessionId()
  {
    return this.cvF;
  }

  public final a.f.a.b<Integer, y> getStateChangeCallback()
  {
    return this.sjL;
  }

  public final void hide()
  {
    AppMethodBeat.i(110425);
    this.sjq.pause();
    this.contentView.setVisibility(8);
    AppMethodBeat.o(110425);
  }

  public final void lL(boolean paramBoolean)
  {
    AppMethodBeat.i(138922);
    ab.i(TAG, "toggleActiveState ".concat(String.valueOf(paramBoolean)));
    if (paramBoolean)
    {
      show();
      AppMethodBeat.o(138922);
    }
    while (true)
    {
      return;
      hide();
      AppMethodBeat.o(138922);
    }
  }

  public final void oE(int paramInt)
  {
    AppMethodBeat.i(110430);
    ab.i(TAG, "switchState " + paramInt + ' ' + bo.dpG());
    if (this.fnH == paramInt)
      AppMethodBeat.o(110430);
    while (true)
    {
      return;
      this.fnH = paramInt;
      switch (paramInt)
      {
      case 4:
      default:
      case 1:
      case 5:
      case 2:
      case 3:
      }
      while (true)
      {
        Object localObject1 = this.sjL;
        if (localObject1 == null)
          break label803;
        ((a.f.a.b)localObject1).am(Integer.valueOf(this.fnH));
        AppMethodBeat.o(110430);
        break;
        this.toUser = this.rVl;
        this.rVm = 0;
        this.sjq.pause();
        this.seK.setVisibility(8);
        this.sjq.setVisibility(8);
        localObject1 = getContext();
        j.o(localObject1, "context");
        this.sjB = new c((Context)localObject1);
        Object localObject2 = new ViewGroup.LayoutParams(-1, -1);
        localObject1 = getContext();
        j.o(localObject1, "context");
        localObject1 = new StoryCommentInputView((Context)localObject1);
        ((StoryCommentInputView)localObject1).setCommentInputCallback(this.sjn);
        StoryCommentInputView.a((StoryCommentInputView)localObject1, this.sjD);
        c localc = this.sjB;
        if (localc != null)
          localc.setContentView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
        localObject2 = this.sjB;
        if (localObject2 != null)
          ((c)localObject2).show();
        this.sjC = false;
        localObject2 = this.sjB;
        if (localObject2 != null)
        {
          ((c)localObject2).setOnDismissListener((DialogInterface.OnDismissListener)new StoryCommentView.f(this, (StoryCommentInputView)localObject1));
          continue;
          this.sjq.pause();
          this.sjq.setVisibility(8);
          localObject1 = getContext();
          j.o(localObject1, "context");
          this.sjB = new c((Context)localObject1);
          localObject2 = new ViewGroup.LayoutParams(-1, -1);
          localObject1 = getContext();
          j.o(localObject1, "context");
          localObject1 = new StoryCommentInputView((Context)localObject1);
          ((StoryCommentInputView)localObject1).setCommentInputCallback(this.sjn);
          ((StoryCommentInputView)localObject1).a(this.sjD, true, this.toUser);
          localc = this.sjB;
          if (localc != null)
            localc.setContentView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
          localObject2 = this.sjB;
          if (localObject2 != null)
            ((c)localObject2).show();
          this.sjC = false;
          localObject2 = this.sjB;
          if (localObject2 != null)
          {
            ((c)localObject2).setOnDismissListener((DialogInterface.OnDismissListener)new StoryCommentView.g(this, (StoryCommentInputView)localObject1));
            continue;
            this.toUser = this.rVl;
            this.rVm = 0;
            if (this.czr)
            {
              this.sjw.setVisibility(0);
              this.sjx.setVisibility(8);
            }
            while (true)
            {
              this.iVh.animate().cancel();
              this.iVh.animate().alpha(0.0F).start();
              this.seK.animate().alpha(0.0F).withEndAction((Runnable)new StoryCommentView.h(this)).start();
              this.sjq.animate().cancel();
              this.sjq.setVisibility(0);
              this.sjq.setAlpha(1.0F);
              this.sjq.resume();
              localObject1 = this.sjB;
              if (localObject1 == null)
                break;
              ((c)localObject1).dismiss();
              break;
              this.sjw.setVisibility(8);
              this.sjx.setVisibility(0);
            }
            this.toUser = this.rVl;
            this.rVm = 0;
            this.iVh.animate().cancel();
            this.iVh.setVisibility(0);
            this.iVh.animate().alpha(1.0F).start();
            this.sjq.animate().alpha(0.0F).withEndAction((Runnable)new StoryCommentView.i(this)).start();
            this.seK.animate().cancel();
            this.seK.setVisibility(0);
            this.seK.setAlpha(1.0F);
            this.sjr.dI((List)this.sjz.rrj);
            this.sjr.notifyDataSetChanged();
            this.sjr.sfG = true;
            this.seK.setAdapter((RecyclerView.a)this.sjr);
            this.seK.bY(this.sjz.rrj.size() - 1);
            this.seK.post((Runnable)new StoryCommentView.j(this));
          }
        }
      }
      label803: AppMethodBeat.o(110430);
    }
  }

  public final void setOutsideClickListener(a.f.a.a<Boolean> parama)
  {
    this.sjM = parama;
  }

  public final void setSessionId(String paramString)
  {
    this.cvF = paramString;
  }

  public final void setStateChangeCallback(a.f.a.b<? super Integer, y> paramb)
  {
    this.sjL = paramb;
  }

  public final void show()
  {
    AppMethodBeat.i(110429);
    this.contentView.setVisibility(0);
    if ((this.contentView.getVisibility() == 0) && (this.fnH == 2) && (this.sjq.cAY))
    {
      this.sjz.rVh = false;
      this.sjq.resume();
      if ((!this.czr) && (this.sjy))
      {
        e locale = g.RP();
        j.o(locale, "storage()");
        int i = locale.Ry().getInt(ac.a.xWB, 0);
        if (i < 3)
        {
          locale = g.RP();
          j.o(locale, "storage()");
          locale.Ry().set(ac.a.xWB, Integer.valueOf(i + 1));
          this.sjs.animate().cancel();
          this.sjs.setVisibility(0);
          this.sjs.animate().alpha(1.0F).start();
          al.af(this.lmq);
          al.n(this.lmq, 3000L);
        }
      }
    }
    AppMethodBeat.o(110429);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView
 * JD-Core Version:    0.6.2
 */