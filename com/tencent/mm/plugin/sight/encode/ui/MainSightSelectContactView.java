package com.tencent.mm.plugin.sight.encode.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.contact.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainSightSelectContactView extends FrameLayout
  implements AbsListView.OnScrollListener, d.a, l
{
  public MMFragmentActivity iWA;
  public ListView mListView;
  boolean qAC = false;
  public int qBf;
  public d qBg;
  Animation qBh;
  public c qBi;
  private View qBj;
  public a qBk;
  public LinearLayout qBl;
  private View qBm;
  private int qBn = -1;
  private int qBo = -1;
  public HashSet<String> qBp;
  public HashSet<String> qBq;

  public MainSightSelectContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MainSightSelectContactView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static boolean CH(int paramInt)
  {
    if (paramInt == -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void b(List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(25088);
    if (this.qAC)
      AppMethodBeat.o(25088);
    while (true)
    {
      return;
      if (paramList == null)
      {
        AppMethodBeat.o(25088);
      }
      else
      {
        if (paramBoolean1)
        {
          this.qBq.clear();
          this.qBp.clear();
          c.qAQ = true;
          c.qAR = false;
        }
        if (this.qBi != null)
          this.qBi.aZ(paramList);
        if (paramBoolean2)
        {
          clQ();
          AppMethodBeat.o(25088);
        }
        else
        {
          if (this.qBm != null)
            this.mListView.removeFooterView(this.qBm);
          AppMethodBeat.o(25088);
        }
      }
    }
  }

  public final void I(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(25089);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("@search.tencent");
    localArrayList.add("@sns.tencent");
    Object localObject = getInitData();
    if (paramBoolean1)
    {
      localArrayList.addAll(this.qBq);
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!localArrayList.contains(str))
          localArrayList.add(str);
      }
    }
    localArrayList.addAll((Collection)localObject);
    b(localArrayList, paramBoolean2, true);
    AppMethodBeat.o(25089);
  }

  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(25092);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.qBq.contains(parama.ehM.field_username);
      AppMethodBeat.o(25092);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25092);
    }
  }

  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(25091);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.qBp.contains(parama.ehM.field_username);
      AppMethodBeat.o(25091);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25091);
    }
  }

  public final void clO()
  {
    AppMethodBeat.i(25086);
    if (this.qBl == null)
      AppMethodBeat.o(25086);
    while (true)
    {
      return;
      this.qBl.getChildAt(0).setVisibility(8);
      this.qBj.setVisibility(0);
      List localList = this.qBi.qAO;
      localList.remove("@search.tencent");
      localList.remove("@sns.tencent");
      localList.remove("@draft.tencent");
      b(localList, false, true);
      this.qBk.clD();
      if (!this.qBk.DX())
        this.qBk.clE();
      this.qBk.clF();
      AppMethodBeat.o(25086);
    }
  }

  public final void clP()
  {
    AppMethodBeat.i(25085);
    if (this.qBl == null)
      AppMethodBeat.o(25085);
    while (true)
    {
      return;
      this.qBl.getChildAt(0).setVisibility(0);
      this.qBj.setVisibility(8);
      I(true, false);
      this.qBk.clC();
      AppMethodBeat.o(25085);
    }
  }

  public final void clQ()
  {
    AppMethodBeat.i(25087);
    this.mListView.post(new MainSightSelectContactView.1(this));
    AppMethodBeat.o(25087);
  }

  public final boolean clR()
  {
    AppMethodBeat.i(25094);
    boolean bool;
    if (this.qBq == null)
    {
      bool = true;
      AppMethodBeat.o(25094);
    }
    while (true)
    {
      return bool;
      bool = this.qBq.isEmpty();
      AppMethodBeat.o(25094);
    }
  }

  public final void db(List<String> paramList)
  {
    AppMethodBeat.i(25096);
    b(paramList, false, false);
    AppMethodBeat.o(25096);
  }

  public Activity getActivity()
  {
    return this.iWA;
  }

  public ListView getContentLV()
  {
    return this.mListView;
  }

  public List<String> getInitData()
  {
    AppMethodBeat.i(25090);
    ArrayList localArrayList = new ArrayList();
    aw.ZK();
    List localList = com.tencent.mm.model.c.XR().dsN();
    localList.remove(r.Yz());
    localArrayList.addAll(localList);
    AppMethodBeat.o(25090);
    return localArrayList;
  }

  public ListView getListView()
  {
    return this.mListView;
  }

  public LinkedList<String> getSelectedContact()
  {
    AppMethodBeat.i(25093);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.qBq);
    AppMethodBeat.o(25093);
    return localLinkedList;
  }

  final String mW(int paramInt)
  {
    String str = null;
    AppMethodBeat.i(25095);
    Object localObject = this.qBi.Pn(paramInt);
    if (localObject == null)
      AppMethodBeat.o(25095);
    while (true)
    {
      return str;
      localObject = ((com.tencent.mm.ui.contact.a.a)localObject).ehM;
      if (localObject == null)
      {
        AppMethodBeat.o(25095);
      }
      else
      {
        str = ((ap)localObject).field_username;
        AppMethodBeat.o(25095);
      }
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(25098);
    if ((this.qBl == null) || (paramAbsListView == null) || (this.qBl.getHeight() <= 0) || (this.iWA == null))
      AppMethodBeat.o(25098);
    while (true)
    {
      return;
      paramInt1 = this.qBl.getHeight() - this.iWA.getSupportActionBar().getHeight();
      paramInt2 = -this.qBl.getTop();
      if (paramInt2 >= 0)
        break;
      AppMethodBeat.o(25098);
    }
    float f = paramInt2 / paramInt1;
    this.qBk.setCameraShadowAlpha(f);
    if ((this.qBl.getTop() < 0) && (this.qBl.getTop() <= -paramInt1));
    for (boolean bool = true; ; bool = false)
    {
      this.qBk.kD(bool);
      AppMethodBeat.o(25098);
      break;
    }
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(25097);
    if (paramInt == 1)
      bo.hideVKB(paramAbsListView);
    AppMethodBeat.o(25097);
  }

  public void setEmptyBgView(View paramView)
  {
    this.qBj = paramView;
  }

  public void setIsMultiSelect(boolean paramBoolean)
  {
    this.qBi.qAP = paramBoolean;
  }

  public void setMainSightContentView(a parama)
  {
    this.qBk = parama;
  }

  public void setSearchView(View paramView)
  {
    AppMethodBeat.i(25084);
    d locald = this.qBg;
    locald.qAX = paramView;
    locald.qAV = ((EditText)paramView.findViewById(2131820980));
    locald.qAW = ((TextView)paramView.findViewById(2131825724));
    locald.qAV.setOnFocusChangeListener(locald);
    locald.qAV.addTextChangedListener(locald);
    locald.qAW.setOnClickListener(locald);
    locald.qAZ = ((InputMethodManager)paramView.getContext().getSystemService("input_method"));
    AppMethodBeat.o(25084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.MainSightSelectContactView
 * JD-Core Version:    0.6.2
 */