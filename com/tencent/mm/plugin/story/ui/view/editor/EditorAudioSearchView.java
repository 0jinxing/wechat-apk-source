package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.m;
import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.g.b.a.bd;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.b;
import com.tencent.mm.plugin.story.model.audio.b.a;
import com.tencent.mm.plugin.story.ui.a.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.ak;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "callback", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$AudioSearchCallback;", "getCallback", "()Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$AudioSearchCallback;", "setCallback", "(Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$AudioSearchCallback;)V", "mAdapter", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;", "mClickClosePanel", "Landroid/view/View;", "mCloseBtn", "Landroid/widget/TextView;", "mEditCleanBtn", "Landroid/widget/ImageView;", "mEditView", "Landroid/widget/EditText;", "mFinishBtn", "Landroid/widget/Button;", "mLastSelectItem", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "mLastSelectTimestamp", "", "mRelatedRecId", "getMRelatedRecId", "()J", "setMRelatedRecId", "(J)V", "mScrollListener", "com/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$mScrollListener$1", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$mScrollListener$1;", "mSearchIcon", "mSearchNoResultTv", "mSearchOffset", "mSearchPanel", "mSearchRequestId", "mSearchResultView", "Landroid/support/v7/widget/RecyclerView;", "mSearchString", "mSearchingView", "Landroid/widget/LinearLayout;", "mSelectedPosition", "mTagsPanel", "mTranslateOffset", "showImeRunnable", "Ljava/lang/Runnable;", "back", "", "backAndPausePlayer", "", "cleanAndPausePlayer", "doSearch", "loadMore", "handleResult", "audioList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/RecommendedMusicInfo;", "init", "isShow", "reportSelect", "reset", "selectItem", "position", "selectSearchItem", "setImeVisibility", "visible", "setMusicPlayer", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setSelection", "(Ljava/lang/Integer;)V", "setShow", "showNoResult", "showResultList", "Ljava/util/ArrayList;", "showSearchPanel", "showSearching", "showTagsPanel", "AudioSearchCallback", "plugin-story_release"})
public final class EditorAudioSearchView extends RelativeLayout
{
  private final String TAG;
  private final Runnable lnE;
  private Button nsJ;
  int sC;
  private View skA;
  private TextView skB;
  EditText skC;
  private RecyclerView skD;
  private TextView skE;
  private LinearLayout skF;
  private ImageView skG;
  private ImageView skH;
  private e skI;
  private long skJ;
  private int skK;
  private String skL;
  private AudioCacheInfo skM;
  private long skN;
  private long skO;
  a skP;
  private final l skQ;
  private int skx;
  private View sky;
  private View skz;

  public EditorAudioSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110499);
    this.TAG = "MicroMsg.EditorAudioSearchView";
    this.sC = -1;
    this.skQ = new l(this);
    this.lnE = ((Runnable)new EditorAudioSearchView.n(this));
    init();
    AppMethodBeat.o(110499);
  }

  public EditorAudioSearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110500);
    this.TAG = "MicroMsg.EditorAudioSearchView";
    this.sC = -1;
    this.skQ = new l(this);
    this.lnE = ((Runnable)new EditorAudioSearchView.n(this));
    init();
    AppMethodBeat.o(110500);
  }

  private final void cCs()
  {
    AppMethodBeat.i(110492);
    View localView = this.sky;
    if (localView != null)
      localView.setVisibility(0);
    localView = this.skz;
    if (localView != null)
    {
      localView.setVisibility(8);
      AppMethodBeat.o(110492);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110492);
    }
  }

  private final void cCt()
  {
    AppMethodBeat.i(110493);
    Object localObject = this.skF;
    if (localObject != null)
      ((LinearLayout)localObject).setVisibility(8);
    localObject = this.skD;
    if (localObject != null)
      ((RecyclerView)localObject).setVisibility(8);
    localObject = this.skE;
    if (localObject != null)
    {
      ((TextView)localObject).setVisibility(0);
      AppMethodBeat.o(110493);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110493);
    }
  }

  private final void init()
  {
    AppMethodBeat.i(110488);
    View.inflate(getContext(), 2130970877, (ViewGroup)this);
    this.skB = ((TextView)findViewById(2131828103));
    this.skC = ((EditText)findViewById(2131828109));
    this.nsJ = ((Button)findViewById(2131828105));
    this.skD = ((RecyclerView)findViewById(2131828116));
    this.skE = ((TextView)findViewById(2131828112));
    this.skF = ((LinearLayout)findViewById(2131828113));
    this.skG = ((ImageView)findViewById(2131828108));
    this.sky = findViewById(2131828110);
    this.skz = findViewById(2131828111);
    this.skA = findViewById(2131828117);
    this.skH = ((ImageView)findViewById(2131828107));
    Object localObject = this.skH;
    if (localObject != null)
      ((ImageView)localObject).setImageDrawable(ah.f(getContext(), 2131231431, -1));
    localObject = this.nsJ;
    if (localObject != null)
      ((Button)localObject).setEnabled(false);
    localObject = this.skG;
    if (localObject != null)
      ((ImageView)localObject).setImageDrawable(ah.f(getContext(), 2131231408, -1));
    localObject = this.skG;
    if (localObject != null)
      ((ImageView)localObject).setOnClickListener((View.OnClickListener)new c(this));
    localObject = this.skD;
    if (localObject != null);
    for (localObject = ((RecyclerView)localObject).getLayoutParams(); localObject == null; localObject = null)
    {
      localObject = new a.v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      AppMethodBeat.o(110488);
      throw ((Throwable)localObject);
    }
    ((ViewGroup.MarginLayoutParams)localObject).bottomMargin = (ak.fr(getContext()) + a.fromDPToPix(getContext(), 16));
    localObject = this.skD;
    if (localObject != null)
    {
      getContext();
      ((RecyclerView)localObject).setLayoutManager((RecyclerView.i)new LinearLayoutManager(1));
    }
    localObject = this.skD;
    if (localObject != null)
      ((RecyclerView)localObject).a((RecyclerView.m)this.skQ);
    this.skI = new e();
    localObject = this.skD;
    if (localObject != null)
      ((RecyclerView)localObject).setAdapter((RecyclerView.a)this.skI);
    localObject = this.skB;
    if (localObject != null)
      ((TextView)localObject).setOnClickListener((View.OnClickListener)new EditorAudioSearchView.d(this));
    localObject = this.nsJ;
    if (localObject != null)
      ((Button)localObject).setOnClickListener((View.OnClickListener)new EditorAudioSearchView.e(this));
    localObject = this.skC;
    if (localObject != null)
      ((EditText)localObject).setOnFocusChangeListener((View.OnFocusChangeListener)new EditorAudioSearchView.f(this));
    localObject = this.skC;
    if (localObject != null)
      ((EditText)localObject).addTextChangedListener((TextWatcher)new EditorAudioSearchView.g(this));
    localObject = this.skC;
    if (localObject != null)
      ((EditText)localObject).setOnEditorActionListener((TextView.OnEditorActionListener)new EditorAudioSearchView.h(this));
    localObject = this.skI;
    if (localObject != null)
      ((e)localObject).llV = ((m)new EditorAudioSearchView.i(this));
    localObject = this.skA;
    if (localObject != null)
      ((View)localObject).setOnClickListener((View.OnClickListener)new j(this));
    setOnClickListener((View.OnClickListener)EditorAudioSearchView.k.skT);
    this.skx = ak.hy(getContext()).y;
    setTranslationY(this.skx);
    cCs();
    AppMethodBeat.o(110488);
  }

  private final void setImeVisibility(boolean paramBoolean)
  {
    AppMethodBeat.i(110490);
    if (paramBoolean)
    {
      post(this.lnE);
      AppMethodBeat.o(110490);
    }
    while (true)
    {
      return;
      removeCallbacks(this.lnE);
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
      {
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        AppMethodBeat.o(110490);
      }
      else
      {
        AppMethodBeat.o(110490);
      }
    }
  }

  public final void Fj(int paramInt)
  {
    AppMethodBeat.i(110489);
    Object localObject1 = this.skI;
    int i;
    Object localObject2;
    if ((localObject1 == null) || (((e)localObject1).llU != paramInt))
    {
      this.sC = paramInt;
      localObject1 = this.skI;
      if (localObject1 == null)
        break label102;
      localObject1 = ((e)localObject1).Fg(paramInt);
      if (localObject1 == null)
        break label107;
      i = ((AudioCacheInfo)localObject1).type;
      localObject2 = AudioCacheInfo.rUj;
      if (i != AudioCacheInfo.cyM())
        break label107;
      localObject2 = this.skP;
      if (localObject2 != null)
        ((a)localObject2).c(null);
    }
    while (true)
    {
      this.skM = ((AudioCacheInfo)localObject1);
      this.skN = System.currentTimeMillis();
      AppMethodBeat.o(110489);
      return;
      label102: localObject1 = null;
      break;
      label107: if (localObject1 != null)
      {
        i = ((AudioCacheInfo)localObject1).type;
        localObject2 = AudioCacheInfo.rUj;
        if (i == AudioCacheInfo.cyL())
        {
          localObject2 = this.skI;
          if (localObject2 != null)
            ((e)localObject2).setSelection(Integer.valueOf(paramInt));
          localObject2 = this.skP;
          if (localObject2 != null)
            ((a)localObject2).c((AudioCacheInfo)localObject1);
          localObject2 = this.nsJ;
          if (localObject2 != null)
            ((Button)localObject2).setEnabled(true);
          cCu();
        }
      }
    }
  }

  final void cCr()
  {
    AppMethodBeat.i(110491);
    cCu();
    Object localObject = b.rUx;
    b.cyT().cH(1L);
    localObject = b.rUx;
    b.a.cyU();
    reset();
    localObject = this.skC;
    if (localObject != null)
      ((EditText)localObject).clearFocus();
    localObject = this.skP;
    if (localObject != null)
      ((a)localObject).cCv();
    localObject = this.skP;
    if (localObject != null)
    {
      ((a)localObject).cCw();
      AppMethodBeat.o(110491);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110491);
    }
  }

  final void cCu()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(110494);
    StringBuilder localStringBuilder;
    Object localObject3;
    if (this.skM != null)
    {
      localStringBuilder = new StringBuilder();
      localObject3 = b.rUx;
      if (!bo.isNullOrNil(b.cyT().Gw()))
        break label133;
      localObject3 = this.skM;
      localObject1 = localObject2;
      if (localObject3 != null)
        localObject1 = Integer.valueOf(((AudioCacheInfo)localObject3).rTW);
      localStringBuilder.append(localObject1).append(":1:").append(System.currentTimeMillis() - this.skN);
    }
    while (true)
    {
      localObject1 = b.rUx;
      localObject2 = b.cyT();
      localObject1 = ((bd)localObject2).Gw();
      ((bd)localObject2).fU((String)localObject1 + localStringBuilder.toString());
      AppMethodBeat.o(110494);
      return;
      label133: localObject2 = localStringBuilder.append(";");
      localObject3 = this.skM;
      if (localObject3 != null)
        localObject1 = Integer.valueOf(((AudioCacheInfo)localObject3).rTW);
      ((StringBuilder)localObject2).append(localObject1).append(":1:").append(System.currentTimeMillis() - this.skN);
    }
  }

  public final a getCallback()
  {
    return this.skP;
  }

  public final long getMRelatedRecId()
  {
    return this.skO;
  }

  public final void reset()
  {
    AppMethodBeat.i(110497);
    this.skK = 0;
    this.sC = -1;
    this.skJ = 0L;
    Object localObject = this.nsJ;
    if (localObject != null)
      ((Button)localObject).setEnabled(false);
    localObject = this.skC;
    if (localObject != null)
      ((EditText)localObject).setText(null);
    localObject = this.skI;
    if (localObject != null)
      ((e)localObject).setSelection(null);
    localObject = this.skD;
    if (localObject != null)
      ((RecyclerView)localObject).bY(0);
    localObject = this.skI;
    if (localObject != null)
      ((e)localObject).dG((List)new LinkedList());
    cCs();
    this.skL = null;
    this.skM = null;
    this.skN = 0L;
    AppMethodBeat.o(110497);
  }

  public final void setCallback(a parama)
  {
    this.skP = parama;
  }

  public final void setMRelatedRecId(long paramLong)
  {
    this.skO = paramLong;
  }

  public final void setMusicPlayer(com.google.android.exoplayer2.v paramv)
  {
    AppMethodBeat.i(110496);
    j.p(paramv, "player");
    e locale = this.skI;
    if (locale != null)
    {
      locale.setMusicPlayer(paramv);
      AppMethodBeat.o(110496);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110496);
    }
  }

  public final void setSelection(Integer paramInteger)
  {
    AppMethodBeat.i(110498);
    e locale = this.skI;
    if (locale != null)
    {
      locale.setSelection(paramInteger);
      AppMethodBeat.o(110498);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110498);
    }
  }

  public final void setShow(boolean paramBoolean)
  {
    AppMethodBeat.i(110495);
    Object localObject;
    if (paramBoolean)
    {
      localObject = b.rUx;
      b.cyT().cK(this.skO);
      setVisibility(0);
      animate().translationY(0.0F).start();
      localObject = this.skC;
      if (localObject != null)
      {
        ((EditText)localObject).requestFocus();
        AppMethodBeat.o(110495);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110495);
      continue;
      animate().translationY(this.skx).withEndAction((Runnable)new EditorAudioSearchView.m(this)).start();
      localObject = this.skC;
      if (localObject != null)
      {
        ((EditText)localObject).clearFocus();
        AppMethodBeat.o(110495);
      }
      else
      {
        AppMethodBeat.o(110495);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$AudioSearchCallback;", "", "onPauseAudio", "", "onSearchAudioCancel", "onSearchAudioFinish", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "onSearchAudioSelected", "plugin-story_release"})
  public static abstract interface a
  {
    public abstract void b(AudioCacheInfo paramAudioCacheInfo);

    public abstract void c(AudioCacheInfo paramAudioCacheInfo);

    public abstract void cCv();

    public abstract void cCw();
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class c
    implements View.OnClickListener
  {
    c(EditorAudioSearchView paramEditorAudioSearchView)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(110476);
      paramView = EditorAudioSearchView.a(this.skR);
      int i;
      if (paramView != null)
      {
        paramView = paramView.getText();
        if (paramView != null)
          if (((CharSequence)paramView).length() == 0)
          {
            i = 1;
            if (i != 0)
              break label80;
            paramView = EditorAudioSearchView.a(this.skR);
            if (paramView == null)
              break label80;
            paramView.setText(null);
            AppMethodBeat.o(110476);
          }
      }
      while (true)
      {
        return;
        i = 0;
        break;
        AppMethodBeat.o(110476);
        continue;
        label80: AppMethodBeat.o(110476);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class j
    implements View.OnClickListener
  {
    j(EditorAudioSearchView paramEditorAudioSearchView)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(110483);
      EditorAudioSearchView.b(this.skR);
      AppMethodBeat.o(110483);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$mScrollListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "plugin-story_release"})
  public static final class l extends RecyclerView.m
  {
    public final void c(RecyclerView paramRecyclerView, int paramInt)
    {
      AppMethodBeat.i(110485);
      j.p(paramRecyclerView, "recyclerView");
      super.c(paramRecyclerView, paramInt);
      if (paramInt == 0)
      {
        paramRecyclerView = paramRecyclerView.getLayoutManager();
        if (paramRecyclerView == null)
        {
          paramRecyclerView = new a.v("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
          AppMethodBeat.o(110485);
          throw paramRecyclerView;
        }
        paramInt = ((LinearLayoutManager)paramRecyclerView).iS();
        paramRecyclerView = b.rUx;
        b.cyT().cI(paramInt);
        paramRecyclerView = EditorAudioSearchView.c(this.skR);
        if (paramRecyclerView != null)
        {
          if (paramInt == paramRecyclerView.getItemCount() - 1)
          {
            paramRecyclerView = paramRecyclerView.Fg(paramInt);
            if (paramRecyclerView == null)
              break label130;
            paramInt = paramRecyclerView.type;
            paramRecyclerView = AudioCacheInfo.rUj;
            if (paramInt == AudioCacheInfo.cyN())
              EditorAudioSearchView.b(this.skR, true);
          }
          AppMethodBeat.o(110485);
        }
      }
      while (true)
      {
        return;
        label130: AppMethodBeat.o(110485);
        continue;
        AppMethodBeat.o(110485);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioSearchView
 * JD-Core Version:    0.6.2
 */