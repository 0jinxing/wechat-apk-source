package com.tencent.mm.plugin.brandservice.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.m.a;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b;
import com.tencent.mm.plugin.brandservice.b.c;
import com.tencent.mm.plugin.websearch.api.ai;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.lk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.BaseSortView.a;
import com.tencent.mm.ui.contact.y;
import com.tencent.mm.ui.widget.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BrandServiceSortView extends BaseSortView
  implements View.OnCreateContextMenuListener, AdapterView.OnItemLongClickListener, com.tencent.mm.plugin.brandservice.b.c.a, BaseSortView.a
{
  private boolean aeV;
  private String igi;
  private boolean jLH;
  private int jLX;
  private int jLY;
  private HashMap<String, SpannableString> jML;
  private c jMM;
  private int jMN;
  private a jMO;
  private boolean jMP;
  private ListView jMQ;
  private BrandServiceSortView.a jMR;
  private String jMS;
  private View jMT;
  private TextView jMU;
  private n.d jMV;

  public BrandServiceSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(14062);
    this.jML = new HashMap();
    this.jMM = new c();
    this.jMN = 251658241;
    this.jLX = 0;
    this.jLY = 0;
    this.jMV = new BrandServiceSortView.3(this);
    this.jMP = false;
    setShowFooterView(false);
    refresh();
    paramContext = this.jMM;
    if (!paramContext.jKu.contains(this))
    {
      ab.i("MicroMsg.BrandService.BrandServiceMgr", "addListener:add");
      paramContext.jKu.add(this);
    }
    this.jMO = new a(getContext());
    setDataSetObserver(this);
    setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(14058);
        paramAnonymousAdapterView = paramAnonymousView.getTag();
        if ((paramAnonymousAdapterView == null) || (!(paramAnonymousAdapterView instanceof BrandServiceSortView.b)))
        {
          ab.w("MicroMsg.BrandServiceSortView", "view tag is null or is not a instance of ResHolder.");
          AppMethodBeat.o(14058);
        }
        while (true)
        {
          return;
          paramAnonymousView = (BrandServiceSortView.b)paramAnonymousAdapterView;
          if (bo.isNullOrNil(paramAnonymousView.username))
          {
            ab.w("MicroMsg.BrandServiceSortView", "username is null or nil.");
            AppMethodBeat.o(14058);
          }
          else
          {
            ai.adO(paramAnonymousView.username);
            y.q(BrandServiceSortView.a(BrandServiceSortView.this), 12, 4, paramAnonymousInt - 1);
            if (BrandServiceSortView.b(BrandServiceSortView.this))
            {
              paramAnonymousAdapterView = new Intent();
              paramAnonymousAdapterView.putExtra("Select_Contact", paramAnonymousView.username);
              paramAnonymousAdapterView.putExtra("Select_Conv_User", paramAnonymousView.username);
              if ((BrandServiceSortView.this.getContext() instanceof Activity))
              {
                paramAnonymousView = (Activity)BrandServiceSortView.this.getContext();
                paramAnonymousView.setResult(-1, paramAnonymousAdapterView);
                paramAnonymousView.finish();
                AppMethodBeat.o(14058);
              }
            }
            else
            {
              paramAnonymousView = paramAnonymousView.username;
              paramAnonymousAdapterView = BrandServiceSortView.this.getContext();
              ab.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
              paramAnonymousView = new Intent().putExtra("Chat_User", paramAnonymousView);
              paramAnonymousView.putExtra("finish_direct", true);
              paramAnonymousView.putExtra("chat_from_scene", 2);
              paramAnonymousView.putExtra("specific_chat_from_scene", 4);
              paramAnonymousView.putExtra("img_gallery_enter_from_chatting_ui", true);
              b.gkE.d(paramAnonymousView, paramAnonymousAdapterView);
              AppMethodBeat.o(14058);
            }
          }
        }
      }
    });
    setOnItemLongClickListener(this);
    AppMethodBeat.o(14062);
  }

  private static List<com.tencent.mm.ui.base.sortview.d> aV(List<lk> paramList)
  {
    AppMethodBeat.i(14064);
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      if (i < paramList.size())
      {
        lk locallk = (lk)paramList.get(i);
        com.tencent.mm.ui.base.sortview.d locald;
        int k;
        if ((locallk != null) && (locallk.ehM != null))
        {
          locald = new com.tencent.mm.ui.base.sortview.d();
          locald.data = locallk;
          int j = locallk.ehM.field_showHead;
          k = j;
          if (j >= 97)
          {
            k = j;
            if (j <= 122)
              k = j - 32;
          }
          if ((k < 65) || (k > 90))
            break label155;
        }
        label155: for (locald.yDG = ((char)k); ; locald.yDG = "#")
        {
          localArrayList.add(locald);
          i++;
          break;
        }
      }
      AppMethodBeat.o(14064);
      paramList = localArrayList;
    }
    while (true)
    {
      return paramList;
      paramList = null;
      AppMethodBeat.o(14064);
    }
  }

  public final boolean a(String paramString, com.tencent.mm.ui.base.sortview.d paramd)
  {
    AppMethodBeat.i(14066);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (paramd != null))
    {
      this.jMS = paramString;
      paramd = (lk)paramd.data;
      if ((paramd == null) || (paramd.ehM == null))
      {
        ab.w("MicroMsg.BrandServiceSortView", "BrandServiceItem or contact is null.");
        AppMethodBeat.o(14066);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      Object localObject = paramd.ehM;
      String str = ((ad)localObject).Oj();
      paramd = ((ad)localObject).Ht();
      localObject = ((ad)localObject).Hu();
      paramString = paramString.toUpperCase();
      if (((!bo.isNullOrNil(str)) && (str.toUpperCase().indexOf(paramString) != -1)) || ((!bo.isNullOrNil(paramd)) && (paramd.toUpperCase().indexOf(paramString) != -1)) || ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).toUpperCase().startsWith(paramString))))
      {
        bool = true;
        AppMethodBeat.o(14066);
      }
      else
      {
        AppMethodBeat.o(14066);
        bool = false;
      }
    }
  }

  public final void aVU()
  {
    AppMethodBeat.i(14072);
    refresh();
    AppMethodBeat.o(14072);
  }

  public final void aW(List<com.tencent.mm.ui.base.sortview.d> paramList)
  {
    AppMethodBeat.i(14076);
    if ((this.jMU != null) && (paramList != null))
      this.jMU.setText(getContext().getString(2131297746, new Object[] { Integer.valueOf(paramList.size()) }));
    AppMethodBeat.o(14076);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(14073);
    if (paramMotionEvent.getAction() == 0)
    {
      this.jLX = ((int)paramMotionEvent.getRawX());
      this.jLY = ((int)paramMotionEvent.getRawY());
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(14073);
    return bool;
  }

  public BrandServiceSortView.a getITransferToChildOnTouchListener()
  {
    return this.jMR;
  }

  public com.tencent.mm.ui.base.sortview.c.a getItemViewCreator()
  {
    AppMethodBeat.i(14071);
    BrandServiceSortView.2 local2 = new BrandServiceSortView.2(this);
    AppMethodBeat.o(14071);
    return local2;
  }

  public ListView getListView()
  {
    AppMethodBeat.i(14069);
    this.jMQ = ((ListView)findViewById(2131821698));
    if (this.jMT == null)
    {
      this.jMT = inflate(getContext(), 2130969246, null);
      if ((this.jMQ != null) && (this.jMT != null))
      {
        this.jMU = ((TextView)this.jMT.findViewById(2131823158));
        this.jMQ.addFooterView(this.jMT, null, false);
      }
    }
    ListView localListView = this.jMQ;
    AppMethodBeat.o(14069);
    return localListView;
  }

  public View getNoResultView()
  {
    AppMethodBeat.i(14070);
    View localView = findViewById(2131821905);
    AppMethodBeat.o(14070);
    return localView;
  }

  public VerticalScrollBar getScrollBar()
  {
    AppMethodBeat.i(14068);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(2131821699);
    AppMethodBeat.o(14068);
    return localVerticalScrollBar;
  }

  public final View inflate()
  {
    AppMethodBeat.i(14067);
    View localView = View.inflate(getContext(), 2130968887, this);
    AppMethodBeat.o(14067);
    return localView;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(14075);
    if (paramContextMenuInfo == null)
    {
      ab.i("MicroMsg.BrandServiceSortView", "menuInfo is null.");
      AppMethodBeat.o(14075);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BrandServiceSortView", "onCreateContextMenu");
      paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      paramView = (com.tencent.mm.ui.base.sortview.d)((AdapterView)paramView).getItemAtPosition(paramContextMenuInfo.position);
      if ((paramView == null) || (paramView.data == null))
      {
        ab.i("MicroMsg.BrandServiceSortView", "SortEntity(%s) is null or its data is null.", new Object[] { paramView });
        AppMethodBeat.o(14075);
      }
      else
      {
        ad localad = ((lk)paramView.data).ehM;
        if (localad == null)
        {
          ab.e("MicroMsg.BrandServiceSortView", "onCreateContextMenu, contact is null");
          AppMethodBeat.o(14075);
        }
        else
        {
          this.igi = localad.field_username;
          paramView = localad.Oj();
          paramContextMenu.setHeaderTitle(j.b(getContext(), paramView));
          paramView = f.qX(localad.field_username);
          if ((paramView != null) && (!paramView.adO()))
            paramContextMenu.add(paramContextMenuInfo.position, 0, 0, 2131301280);
          AppMethodBeat.o(14075);
        }
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(14078);
    if (this.jMR != null)
      this.jMR.aWe();
    boolean bool;
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      bool = true;
      AppMethodBeat.o(14078);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14078);
    }
  }

  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(14074);
    this.jMO.zRY = paramView;
    this.jMO.a(paramAdapterView, paramInt, paramLong, this, this.jMV, this.jLX, this.jLY);
    AppMethodBeat.o(14074);
    return true;
  }

  public final void refresh()
  {
    AppMethodBeat.i(14063);
    this.jMM.init();
    dJ(aV(this.jMM.rY(this.jMN)));
    super.refresh();
    AppMethodBeat.o(14063);
  }

  public final void release()
  {
    AppMethodBeat.i(14065);
    if (g.RK())
      z.afb().aeL();
    this.jMM.release();
    AppMethodBeat.o(14065);
  }

  public void setITransferToChildOnTouchListener(BrandServiceSortView.a parama)
  {
    this.jMR = parama;
  }

  public void setReturnResult(boolean paramBoolean)
  {
    this.jLH = paramBoolean;
  }

  public void setShowFooterView(boolean paramBoolean)
  {
    AppMethodBeat.i(14077);
    this.aeV = paramBoolean;
    x(this.jMU, paramBoolean);
    AppMethodBeat.o(14077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView
 * JD-Core Version:    0.6.2
 */