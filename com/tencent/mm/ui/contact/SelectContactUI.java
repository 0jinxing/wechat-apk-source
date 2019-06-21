package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.u.a;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SelectContactUI extends MMBaseSelectContactUI
  implements f
{
  private ProgressDialog ehJ;
  private List<String> elZ;
  private HashSet<String> gnG;
  private String jcF;
  private String nHU;
  private int requestCode;
  private String title;
  private int zkf;
  private TextView zoA;
  private TextView zoB;
  private TextView zoC;
  private TextView zoD;
  private TextView zoE;
  private TextView zoF;
  private boolean zoG;
  private boolean zoH;
  private String zoI;
  private String zoJ;
  private boolean zoK;
  private boolean zoL;
  private boolean zoM;
  private boolean zoN;
  private String zoO;
  private HashSet<String> zol;
  private int zon;
  private boolean zoo;
  private SelectContactUI.a zop;

  public SelectContactUI()
  {
    AppMethodBeat.i(33871);
    this.zoo = true;
    this.zoN = false;
    this.zop = new SelectContactUI.a();
    AppMethodBeat.o(33871);
  }

  private void Kt()
  {
    AppMethodBeat.i(33883);
    if ((s.hr(this.zon, 64)) && (this.gnG.size() > 0))
    {
      updateOptionMenuText(1, getString(2131296994) + "(" + this.gnG.size() + ")");
      int i = getIntent().getIntExtra("min_limit_num", 0);
      if ((s.hr(this.zon, 262144)) && (this.gnG.size() < i))
      {
        enableOptionMenu(1, false);
        AppMethodBeat.o(33883);
      }
    }
    while (true)
    {
      return;
      enableOptionMenu(1, true);
      AppMethodBeat.o(33883);
      continue;
      updateOptionMenuText(1, getString(2131296994));
      enableOptionMenu(1, false);
      AppMethodBeat.o(33883);
    }
  }

  private static List<String> O(List<String> paramList)
  {
    AppMethodBeat.i(33896);
    LinkedList localLinkedList = new LinkedList();
    if (!aw.RK())
      AppMethodBeat.o(33896);
    while (true)
    {
      return localLinkedList;
      if (paramList == null)
      {
        AppMethodBeat.o(33896);
      }
      else
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          aw.ZK();
          ad localad = com.tencent.mm.model.c.XM().aoO(str);
          paramList = str;
          if (localad != null)
          {
            paramList = str;
            if ((int)localad.ewQ != 0)
              paramList = localad.Oj();
          }
          localLinkedList.add(paramList);
        }
        AppMethodBeat.o(33896);
      }
    }
  }

  private TextView a(ListView paramListView, View.OnClickListener paramOnClickListener, String paramString)
  {
    AppMethodBeat.i(33880);
    View localView = v.hu(this).inflate(2130969809, null);
    localView.setOnClickListener(paramOnClickListener);
    paramOnClickListener = (TextView)localView.findViewById(2131822953);
    paramOnClickListener.setText(paramString);
    paramListView.addHeaderView(localView);
    AppMethodBeat.o(33880);
    return paramOnClickListener;
  }

  private void a(com.tencent.mm.roomsdk.a.c.a parama)
  {
    AppMethodBeat.i(33888);
    parama.d(new SelectContactUI.6(this, parama));
    getString(2131297061);
    parama.a(this, getString(2131300938), true, new SelectContactUI.7(this, parama));
    AppMethodBeat.o(33888);
  }

  private void arR(String paramString)
  {
    AppMethodBeat.i(33894);
    if (this.zol.contains(paramString))
      AppMethodBeat.o(33894);
    while (true)
    {
      return;
      dIb();
      this.opo.ajq(paramString);
      if (this.gnG.contains(paramString))
      {
        this.gnG.remove(paramString);
        AppMethodBeat.o(33894);
      }
      else
      {
        this.gnG.add(paramString);
        AppMethodBeat.o(33894);
      }
    }
  }

  private void dIj()
  {
    int i = 0;
    AppMethodBeat.i(33876);
    if ((this.zoo) && ((this.zkf == 1) || (this.zkf == 0)))
      if (this.zol == null)
        break label92;
    label92: for (int j = this.zol.size(); ; j = 0)
    {
      if (this.gnG != null)
        i = this.gnG.size();
      int k = bo.ank(com.tencent.mm.m.g.Nu().getValue("ChatRoomInviteStartCount"));
      this.zop.e(this, j + i, k);
      AppMethodBeat.o(33876);
      return;
    }
  }

  private void dIk()
  {
    AppMethodBeat.i(33886);
    ArrayList localArrayList = qF(true);
    localArrayList.remove(com.tencent.mm.model.r.Yz());
    if (localArrayList.size() > 0)
    {
      this.ehJ = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131301306), false, null);
      aw.RS().aa(new SelectContactUI.3(this, localArrayList));
    }
    AppMethodBeat.o(33886);
  }

  private void dIl()
  {
    AppMethodBeat.i(33887);
    Object localObject = qF(false);
    ((ArrayList)localObject).remove(com.tencent.mm.model.r.Yz());
    String str = bo.c((List)localObject, ",");
    if (!bo.ek((List)localObject))
    {
      com.tencent.mm.ui.base.h.a(this.mController.ylL, true, getString(2131300900), "", getString(2131300899), getString(2131300898), new SelectContactUI.4(this, str), new SelectContactUI.5(this, str));
      AppMethodBeat.o(33887);
    }
    while (true)
    {
      return;
      localObject = new Intent();
      ((Intent)localObject).putExtra("Select_Contact", str);
      ((Intent)localObject).putExtra("Select_Conv_User", str);
      ((Intent)localObject).putExtra("Select_Contact", str);
      ((Intent)localObject).putExtra("Select_Contacts_To_Create_New_Label", str);
      setResult(0, (Intent)localObject);
      finish();
      AppMethodBeat.o(33887);
    }
  }

  private boolean fq(List<String> paramList)
  {
    AppMethodBeat.i(33881);
    ab.i("MicroMsg.SelectContactUI", "handleSelect %s", new Object[] { paramList });
    boolean bool;
    if (s.hr(this.zon, 65536))
    {
      String str = fs(paramList);
      this.zoM = true;
      com.tencent.mm.ui.base.h.a(this.mController.ylL, str, null, true, new SelectContactUI.17(this, paramList), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(33866);
          SelectContactUI.b(SelectContactUI.this, false);
          AppMethodBeat.o(33866);
        }
      });
      bool = this.zoM;
      AppMethodBeat.o(33881);
    }
    while (true)
    {
      return bool;
      bool = fr(paramList);
      AppMethodBeat.o(33881);
    }
  }

  private boolean fr(List<String> paramList)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(33882);
    if (getIntent().getBooleanExtra("Add_SendCard", false))
    {
      if (bo.isNullOrNil(this.zoI))
      {
        this.zoI = bo.c(paramList, ",");
        bool2 = t.kH(this.zoJ);
        paramList = new Intent();
        paramList.putExtra("be_send_card_name", this.zoI);
        paramList.putExtra("received_card_name", this.zoJ);
        paramList.putExtra("Is_Chatroom", bool2);
        setResult(-1, paramList);
        finish();
        AppMethodBeat.o(33882);
        bool2 = true;
      }
      while (true)
      {
        return bool2;
        if (bo.isNullOrNil(this.zoJ))
        {
          this.zoJ = bo.c(paramList, ",");
          break;
        }
        ab.e("MicroMsg.SelectContactUI", "send card occur error: send:%s | receive:%s", new Object[] { this.zoI, this.zoJ });
        AppMethodBeat.o(33882);
      }
    }
    Object localObject;
    int i;
    if (getIntent().getBooleanExtra("snsPostWhoCanSee", false))
    {
      ab.i("MicroMsg.SelectContactUI", "sns post who can see scene,users=%s", new Object[] { paramList.toString() });
      localObject = qF(false);
      ((ArrayList)localObject).remove(com.tencent.mm.model.r.Yz());
      paramList = paramList.iterator();
      for (i = 0; paramList.hasNext(); i = 1)
      {
        label234: String str = (String)paramList.next();
        if (bo.isNullOrNil(str))
          break label671;
        if ((((ArrayList)localObject).contains(str)) || (com.tencent.mm.model.r.Yz().equals(str)))
          break label234;
        aw.ZK();
        ad localad = com.tencent.mm.model.c.XM().aoO(str);
        if ((localad == null) || ((int)localad.ewQ == 0) || (!com.tencent.mm.n.a.jh(localad.field_type)))
          break label671;
        arR(str);
        ((ArrayList)localObject).add(str);
      }
    }
    label671: 
    while (true)
    {
      break label234;
      if (i != 0)
      {
        Kt();
        dHV().notifyDataSetChanged();
        break;
      }
      dIl();
      break;
      if (getIntent().getBooleanExtra("recommend_friends", false))
      {
        ab.i("MicroMsg.SelectContactUI", "Recommend Friends");
        z.a(this.mController.ylL, this.zoJ, paramList);
        break;
      }
      if (s.hr(this.zon, 16384))
      {
        ab.i("MicroMsg.SelectContactUI", "return the result");
        localObject = new Intent();
        paramList = bo.c(paramList, ",");
        ((Intent)localObject).putExtra("Select_Contact", paramList);
        ((Intent)localObject).putExtra("Select_Conv_User", paramList);
        ((Intent)localObject).putExtra("Select_Contact", paramList);
        ((Intent)localObject).putExtra("label_source", this.nHU);
        bool2 = bool1;
        if (this.requestCode == 1)
          bool2 = true;
        ((Intent)localObject).putExtra("Is_Chatroom", bool2);
        setResult(-1, (Intent)localObject);
        finish();
        break;
      }
      if (getIntent().getBooleanExtra("shareImage", false))
      {
        ab.i("MicroMsg.SelectContactUI", "Share Image");
        dIk();
        break;
      }
      if (paramList.size() > 0)
      {
        ab.i("MicroMsg.SelectContactUI", "Launch ChattingUI: users=%s", new Object[] { paramList.toString() });
        finish();
        localObject = new Intent();
        ((Intent)localObject).setClass(this, ChattingUI.class);
        ((Intent)localObject).putExtra("Chat_User", (String)paramList.get(0));
        ((Intent)localObject).addFlags(67108864);
        startActivity((Intent)localObject);
        break;
      }
      ab.e("MicroMsg.SelectContactUI", "unkown action: User=%s", new Object[] { paramList.toString() });
      break;
    }
  }

  private String fs(List<String> paramList)
  {
    AppMethodBeat.i(33895);
    String str = null;
    Object localObject = str;
    if (paramList != null)
    {
      if (paramList.size() != 1)
        break label60;
      localObject = getString(2131302870, new Object[] { com.tencent.mm.model.s.mJ((String)paramList.get(0)) });
    }
    label60: 
    do
    {
      AppMethodBeat.o(33895);
      return localObject;
      localObject = str;
    }
    while (paramList.size() <= 1);
    str = getString(2131297045);
    localObject = new StringBuilder();
    for (int i = 0; ; i++)
    {
      if (i < paramList.size())
      {
        if (i == 3)
          ((StringBuilder)localObject).append("...");
      }
      else
      {
        localObject = getString(2131302870, new Object[] { ((StringBuilder)localObject).toString() });
        break;
      }
      ((StringBuilder)localObject).append(com.tencent.mm.model.s.mJ((String)paramList.get(i)));
      if (i < paramList.size() - 1)
        ((StringBuilder)localObject).append(str);
    }
  }

  private ArrayList<String> qF(boolean paramBoolean)
  {
    AppMethodBeat.i(33884);
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.gnG.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if ((!paramBoolean) && (t.mW((String)localObject)))
      {
        localObject = com.tencent.mm.model.n.mz((String)localObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
            localHashSet.add((String)((Iterator)localObject).next());
        }
      }
      else
      {
        localHashSet.add(localObject);
      }
    }
    localArrayList.addAll(localHashSet);
    AppMethodBeat.o(33884);
    return localArrayList;
  }

  private ArrayList<String> qG(boolean paramBoolean)
  {
    AppMethodBeat.i(33885);
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.gnG.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if ((!paramBoolean) && (t.mW((String)localObject)))
      {
        localObject = com.tencent.mm.model.n.mz((String)localObject);
        if (localObject != null)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
            localHashSet.add((String)((Iterator)localObject).next());
        }
      }
      else
      {
        localHashSet.add(localObject);
      }
    }
    localHashSet.addAll(this.zol);
    localArrayList.addAll(localHashSet);
    AppMethodBeat.o(33885);
    return localArrayList;
  }

  protected final void Kh()
  {
    AppMethodBeat.i(33872);
    super.Kh();
    this.zon = getIntent().getIntExtra("list_attr", s.znD);
    this.title = getIntent().getStringExtra("titile");
    this.jcF = getIntent().getStringExtra("sub_title");
    this.zkf = getIntent().getIntExtra("list_type", -1);
    this.zoo = getIntent().getBooleanExtra("show_too_many_member", true);
    this.nHU = getIntent().getStringExtra("label_source");
    if ((s.hr(this.zon, 256)) && (t.Zi().size() == 0))
      s.hs(this.zon, 256);
    this.zoG = getIntent().getBooleanExtra("Add_SendCard", false);
    this.zoH = getIntent().getBooleanExtra("recommend_friends", false);
    if ((this.zoG) || (this.zoH))
    {
      this.zoI = bo.bc(getIntent().getStringExtra("be_send_card_name"), "");
      this.zoJ = bo.bc(getIntent().getStringExtra("received_card_name"), "");
    }
    this.zoK = getIntent().getBooleanExtra("Forbid_SelectChatRoom", false);
    this.elZ = new ArrayList();
    this.gnG = new HashSet();
    this.zol = new HashSet();
    Object localObject = getIntent().getStringExtra("always_select_contact");
    if (!bo.isNullOrNil((String)localObject))
      this.zol.addAll(bo.P(((String)localObject).split(",")));
    localObject = getIntent().getStringExtra("already_select_contact");
    if (!bo.isNullOrNil((String)localObject))
      this.gnG.addAll(bo.P(((String)localObject).split(",")));
    localObject = new HashSet();
    String str = getIntent().getStringExtra("block_contact");
    if (!bo.isNullOrNil(str))
      ((HashSet)localObject).addAll(bo.P(str.split(",")));
    localObject = new HashSet((Collection)localObject);
    ((HashSet)localObject).addAll(s.dIf());
    ((HashSet)localObject).addAll(s.dIg());
    if (this.zoG)
      ((HashSet)localObject).removeAll(s.dIf());
    this.elZ.addAll((Collection)localObject);
    dIj();
    AppMethodBeat.o(33872);
  }

  protected final void QA(String paramString)
  {
    AppMethodBeat.i(33898);
    com.tencent.mm.plugin.report.service.h.pYm.e(11225, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
    Intent localIntent = new Intent();
    localIntent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
    localIntent.putExtra("label", paramString);
    paramString = new HashSet();
    paramString.addAll(qF(s.hr(this.zon, 8192)));
    paramString.addAll(this.zol);
    localIntent.putExtra("always_select_contact", bo.c(new ArrayList(paramString), ","));
    localIntent.putExtra("always_select_contact", bo.c(new ArrayList(paramString), ","));
    if (s.hr(this.zon, 64))
    {
      localIntent.putExtra("list_attr", s.C(new int[] { 16384, 64, 131072 }));
      if (this.zkf == 14)
        localIntent.putExtra("max_limit_num", getIntent().getIntExtra("max_limit_num", 2147483647));
    }
    while (true)
    {
      startActivityForResult(localIntent, 3);
      AppMethodBeat.o(33898);
      return;
      localIntent.putExtra("list_attr", 16384);
    }
  }

  protected final void a(ListView paramListView, int paramInt)
  {
    AppMethodBeat.i(33879);
    super.a(paramListView, paramInt);
    Object localObject;
    int i;
    int j;
    label329: int k;
    int m;
    if (s.hr(this.zon, 256))
    {
      if (this.zoA == null)
      {
        View.OnClickListener local11 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(33858);
            paramAnonymousView = new Intent();
            paramAnonymousView.setClassName(SelectContactUI.this, "com.tencent.mm.ui.contact.GroupCardSelectUI");
            paramAnonymousView.putExtra("group_select_type", true);
            boolean bool = s.hr(SelectContactUI.a(SelectContactUI.this), 16384);
            paramAnonymousView.putExtra("group_select_need_result", bool);
            if (bool)
              if (SelectContactUI.b(SelectContactUI.this) == 14)
              {
                paramAnonymousView.putExtra("group_multi_select", true);
                paramAnonymousView.putExtra("already_select_contact", ah.c(SelectContactUI.a(SelectContactUI.this, true), ","));
                paramAnonymousView.putExtra("max_limit_num", SelectContactUI.this.getIntent().getIntExtra("max_limit_num", 9));
                SelectContactUI.this.startActivityForResult(paramAnonymousView, 4);
                AppMethodBeat.o(33858);
              }
            while (true)
            {
              return;
              SelectContactUI.this.startActivityForResult(paramAnonymousView, 0);
              AppMethodBeat.o(33858);
              continue;
              SelectContactUI.this.startActivity(paramAnonymousView);
              AppMethodBeat.o(33858);
            }
          }
        };
        if (this.zkf == 14)
        {
          localObject = getString(2131296477);
          this.zoA = a(paramListView, local11, (String)localObject);
        }
      }
      else
      {
        this.zoA.setVisibility(paramInt);
      }
    }
    else
    {
      if (s.hr(this.zon, 512))
      {
        if (this.zoB == null)
          this.zoB = a(paramListView, new SelectContactUI.12(this), getString(2131299818));
        this.zoB.setVisibility(paramInt);
      }
      if (s.hr(this.zon, 1024))
      {
        if (this.zoC == null)
          this.zoC = a(paramListView, new SelectContactUI.13(this), getString(2131296462));
        this.zoC.setVisibility(paramInt);
      }
      if (s.hr(this.zon, 2048))
      {
        if (this.zoE == null)
          this.zoE = a(paramListView, new SelectContactUI.14(this), getString(2131296471));
        this.zoE.setVisibility(paramInt);
        this.zoE.setTextSize(16.0F * com.tencent.mm.bz.a.dm(this.zoE.getContext()));
      }
      if (s.hr(this.zon, 524288))
        if (this.zoD == null)
        {
          localObject = "";
          i = getIntent().getIntExtra("topstory_import_type", 0);
          j = 2131305799;
          if (i != 1)
            break label626;
          localObject = com.tencent.mm.plugin.sns.b.n.qFA.jT(5L);
          if (!bo.ek((List)localObject))
            break label614;
          i = 0;
          localObject = bo.c((List)localObject, ",");
          j = 2131305799;
          k = 2131305800;
          m = i;
          i = k;
        }
    }
    while (true)
    {
      this.zoD = a(paramListView, new SelectContactUI.15(this, i, m, (String)localObject), getString(j));
      this.zoD.setTag(Integer.valueOf(m));
      localObject = this.zoD.getTag();
      if ((!(localObject instanceof Integer)) || (((Integer)localObject).intValue() <= 0))
      {
        this.zoD.setVisibility(8);
        label435: if ((s.hr(this.zon, 16777216)) && (this.zoF == null))
        {
          aw.ZK();
          localObject = com.tencent.mm.model.c.XM().dsq();
          ab.i("MicroMsg.SelectContactUI", "setOpenIMHeaderView %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
          if (((List)localObject).size() != 0)
          {
            this.zoF = a(paramListView, new SelectContactUI.16(this), "");
            paramListView = ((b)com.tencent.mm.kernel.g.K(b.class)).a("3552365301", "openim_acct_type_title", b.a.geR);
            this.zoF.setVisibility(paramInt);
            this.zoF.setText(paramListView);
          }
        }
        if ((!s.hr(this.zon, 16777216)) || (this.zoF == null))
          break label702;
        this.zoF.setBackgroundResource(2130838398);
        AppMethodBeat.o(33879);
      }
      while (true)
      {
        return;
        localObject = getString(2131296461);
        break;
        label614: i = ((List)localObject).size();
        break label329;
        label626: if (i != 2)
          break label858;
        localObject = t.Zn();
        if (bo.ek((List)localObject));
        for (i = 0; ; i = ((List)localObject).size())
        {
          localObject = bo.c((List)localObject, ",");
          j = 2131305797;
          k = 2131305798;
          m = i;
          i = k;
          break;
        }
        this.zoD.setVisibility(paramInt);
        break label435;
        label702: if (s.hr(this.zon, 2048))
        {
          if (this.zoE != null)
          {
            this.zoE.setBackgroundResource(2130838398);
            AppMethodBeat.o(33879);
          }
        }
        else if (s.hr(this.zon, 1024))
        {
          if (this.zoC != null)
          {
            this.zoC.setBackgroundResource(2130838398);
            AppMethodBeat.o(33879);
          }
        }
        else if (s.hr(this.zon, 512))
        {
          if (this.zoB != null)
          {
            this.zoB.setBackgroundResource(2130838398);
            AppMethodBeat.o(33879);
          }
        }
        else
        {
          if ((s.hr(this.zon, 256)) && (this.zoA != null))
            this.zoA.setBackgroundResource(2130838398);
          AppMethodBeat.o(33879);
        }
      }
      label858: i = 2131305800;
      m = 0;
    }
  }

  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(33890);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnG.contains(parama.ehM.field_username);
      AppMethodBeat.o(33890);
    }
    while (true)
    {
      return bool;
      if ((parama.zmX) && (parama.ehM != null))
      {
        bool = this.gnG.contains(parama.ehM.field_username);
        AppMethodBeat.o(33890);
      }
      else if ((parama instanceof com.tencent.mm.ui.contact.a.k))
      {
        bool = this.gnG.isEmpty();
        AppMethodBeat.o(33890);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(33890);
      }
    }
  }

  protected final m aoA()
  {
    AppMethodBeat.i(33878);
    Object localObject;
    if (this.zoN)
    {
      localObject = new r(this, this.elZ, s.hr(this.zon, 64), this.zoO);
      AppMethodBeat.o(33878);
    }
    while (true)
    {
      return localObject;
      localObject = new q(this, this.elZ, s.hr(this.zon, 64), this.scene);
      AppMethodBeat.o(33878);
    }
  }

  protected final boolean aow()
  {
    return false;
  }

  protected final boolean aox()
  {
    return true;
  }

  protected final String aoy()
  {
    return this.title;
  }

  protected final o aoz()
  {
    boolean bool1 = false;
    AppMethodBeat.i(33877);
    c.a locala = new c.a();
    locala.zkR = s.hr(this.zon, 16);
    locala.zkQ = s.hr(this.zon, 32);
    boolean bool2;
    if (!s.hr(this.zon, 4))
    {
      bool2 = true;
      locala.zkS = bool2;
      if (s.hr(this.zon, 1))
        break label319;
      bool2 = true;
      label73: locala.zkT = bool2;
      locala.zkU = s.hr(this.zon, 128);
      locala.zkV = s.hr(this.zon, 1048576);
      locala.zkY = s.hr(this.zon, 256);
      if (locala.zkY)
        locala.zkZ = getIntent().getStringExtra("custom_contact");
      if (locala.zkU)
      {
        this.zoN = true;
        locala.zkW = getIntent().getStringExtra("wechat_sport_contact");
        locala.zkX = getIntent().getStringExtra("wechat_sport_recent_like");
        this.zoO = locala.zkW;
      }
      if (!s.dIh())
        break label324;
    }
    label319: label324: for (locala.zjx = "@all.contact.without.chatroom.without.openim"; ; locala.zjx = "@all.contact.without.chatroom.without.openim.without.openimfavour")
    {
      if ((this.scene == 6) || (this.scene == 5))
        locala.zjx = "@all.contact.without.chatroom.without.openim.without.openimfavour";
      if (getIntent().getBooleanExtra("KBlockOpenImFav", false))
        locala.zjx = "@all.contact.without.chatroom.without.openim.without.openimfavour";
      Object localObject = this.elZ;
      boolean bool3 = s.hr(this.zon, 1);
      boolean bool4 = s.hr(this.zon, 64);
      bool2 = bool1;
      if (this.zkf == 15)
        bool2 = true;
      localObject = new c(this, (List)localObject, bool3, bool4, locala, bool2);
      AppMethodBeat.o(33877);
      return localObject;
      bool2 = false;
      break;
      bool2 = false;
      break label73;
    }
  }

  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(33891);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.zol.contains(parama.ehM.field_username);
      AppMethodBeat.o(33891);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33891);
    }
  }

  public final int[] bMP()
  {
    AppMethodBeat.i(33892);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(131072));
    if (!getIntent().getBooleanExtra("without_openim", false))
      localArrayList.add(Integer.valueOf(131081));
    if (!s.hr(this.zon, 1))
      localArrayList.add(Integer.valueOf(131076));
    if (!s.hr(this.zon, 4))
      localArrayList.add(Integer.valueOf(131075));
    int[] arrayOfInt = new int[localArrayList.size()];
    for (int i = 0; i < localArrayList.size(); i++)
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
    AppMethodBeat.o(33892);
    return arrayOfInt;
  }

  protected final boolean bOd()
  {
    if (this.zoN);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(33875);
    int i = paramInt - getContentLV().getHeaderViewsCount();
    if (i < 0)
    {
      ab.i("MicroMsg.SelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
      AppMethodBeat.o(33875);
    }
    while (true)
    {
      return;
      Object localObject = dHV().Pn(i);
      if (localObject == null)
      {
        AppMethodBeat.o(33875);
      }
      else if ((localObject instanceof com.tencent.mm.ui.contact.a.k))
      {
        if (s.hr(this.zon, 16384))
        {
          ab.i("MicroMsg.SelectContactUI", "handleClickNonSelect, return the result");
          localObject = new Intent();
          ((Intent)localObject).putExtra("Select_Contact", "");
          ((Intent)localObject).putExtra("Select_Conv_User", "");
          ((Intent)localObject).putExtra("Select_Contact", "");
          setResult(-1, (Intent)localObject);
          finish();
        }
        AppMethodBeat.o(33875);
      }
      else if (((com.tencent.mm.ui.contact.a.a)localObject).ehM == null)
      {
        AppMethodBeat.o(33875);
      }
      else if (((com.tencent.mm.ui.contact.a.a)localObject).ehM.field_deleteFlag == 1)
      {
        AppMethodBeat.o(33875);
      }
      else
      {
        localObject = ((com.tencent.mm.ui.contact.a.a)localObject).ehM.field_username;
        ab.i("MicroMsg.SelectContactUI", "ClickUser=%s", new Object[] { localObject });
        if (s.hr(this.zon, 64))
        {
          if ((s.hr(this.zon, 131072)) && (this.gnG.size() >= getIntent().getIntExtra("max_limit_num", 2147483647)))
            if (!this.zol.contains(localObject))
            {
              dIb();
              if (!this.gnG.contains(localObject))
                break label341;
              this.opo.ajq((String)localObject);
              this.gnG.remove(localObject);
            }
          while (true)
          {
            Kt();
            dIj();
            dHW().notifyDataSetChanged();
            AppMethodBeat.o(33875);
            break;
            label341: String str = getIntent().getStringExtra("too_many_member_tip_string");
            localObject = str;
            if (bo.isNullOrNil(str))
              localObject = getString(2131302884, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10)) });
            com.tencent.mm.ui.base.h.a(this.mController.ylL, (String)localObject, getString(2131297031), new SelectContactUI.8(this));
            continue;
            arR((String)localObject);
          }
        }
        fq(bo.P(new String[] { localObject }));
        AppMethodBeat.o(33875);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(33897);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.requestCode = paramInt1;
    ab.i("MicroMsg.SelectContactUI", "requestCode=%d | resultCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(33897);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 0:
    case 4:
    case 1:
    case 2:
    case 3:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(33897);
      break;
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      if (!bo.isNullOrNil(paramIntent))
      {
        fq(bo.P(new String[] { paramIntent }));
        AppMethodBeat.o(33897);
        break;
        Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        Object localObject2 = this.gnG.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramIntent = (String)((Iterator)localObject2).next();
          this.opo.ajr(paramIntent);
        }
        this.gnG.clear();
        if (!bo.isNullOrNil((String)localObject1))
          this.gnG.addAll(bo.P(((String)localObject1).split(",")));
        paramIntent = this.gnG.iterator();
        while (paramIntent.hasNext())
        {
          localObject1 = (String)paramIntent.next();
          this.opo.bU((String)localObject1, false);
        }
        Kt();
        AppMethodBeat.o(33897);
        break;
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        if (!bo.isNullOrNil(paramIntent))
        {
          fq(bo.P(paramIntent.split(",")));
          AppMethodBeat.o(33897);
          break;
          if (paramIntent != null)
          {
            paramIntent = paramIntent.getStringExtra("Select_Contact");
            if (!bo.isNullOrNil(paramIntent))
              fq(bo.P(new String[] { paramIntent }));
            AppMethodBeat.o(33897);
            break;
            paramIntent = paramIntent.getStringExtra("Select_Contact");
            if (bo.isNullOrNil(paramIntent))
            {
              ab.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
              AppMethodBeat.o(33897);
              break;
            }
            ab.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
            if (s.hr(this.zon, 64))
            {
              for (localObject1 : paramIntent.split(","))
                if (this.gnG.add(localObject1))
                  this.opo.ajq((String)localObject1);
              Kt();
              dHV().notifyDataSetChanged();
              AppMethodBeat.o(33897);
              break;
            }
            fq(bo.P(new String[] { paramIntent }));
            AppMethodBeat.o(33897);
            break;
            if (paramIntent != null)
            {
              localObject2 = paramIntent.getStringExtra("Select_Contact");
              localObject1 = paramIntent.getStringExtra("Cancel_Select_Contact");
              if (bo.isNullOrNil((String)localObject2))
              {
                paramIntent = null;
                if (!bo.isNullOrNil((String)localObject1))
                  break label643;
                localObject1 = null;
              }
              label566: Object localObject3;
              while (true)
                if (paramIntent != null)
                {
                  if (this.opo != null)
                  {
                    localObject3 = paramIntent.iterator();
                    while (true)
                      if (((Iterator)localObject3).hasNext())
                      {
                        String str = (String)((Iterator)localObject3).next();
                        if (!this.gnG.contains(str))
                        {
                          this.opo.ajq(str);
                          continue;
                          paramIntent = bo.hT((String)localObject2, ",");
                          break;
                          label643: localObject1 = bo.hT((String)localObject1, ",");
                          break label566;
                        }
                      }
                  }
                  this.gnG.addAll(paramIntent);
                }
              if (localObject1 != null)
              {
                if (this.opo != null)
                {
                  paramIntent = ((List)localObject1).iterator();
                  while (paramIntent.hasNext())
                  {
                    localObject3 = (String)paramIntent.next();
                    this.opo.ajq((String)localObject3);
                  }
                }
                this.gnG.removeAll((Collection)localObject1);
              }
              dHV().notifyDataSetChanged();
              if (getIntent().getBooleanExtra("Add_SendCard", false))
                fq(bo.P(new String[] { localObject2 }));
            }
            Kt();
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33873);
    super.onCreate(paramBundle);
    aw.Rg().a(30, this);
    aw.Rg().a(138, this);
    ab.i("MicroMsg.SelectContactUI", "create!");
    if (!bo.isNullOrNil(this.jcF))
      setMMSubTitle(this.jcF);
    if (s.hr(this.zon, 64))
      a(1, getString(2131296994), new SelectContactUI.2(this), q.b.ymu);
    Kt();
    setBackBtn(new SelectContactUI.1(this));
    if (this.zkf != 15)
    {
      paramBundle = this.gnG.iterator();
      while (paramBundle.hasNext())
      {
        String str = (String)paramBundle.next();
        this.opo.bU(str, false);
      }
    }
    AppMethodBeat.o(33873);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33874);
    aw.Rg().b(30, this);
    aw.Rg().b(138, this);
    super.onDestroy();
    AppMethodBeat.o(33874);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(33889);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (!bo.cv(this))
      AppMethodBeat.o(33889);
    while (true)
    {
      return;
      if (u.a.a(this, paramInt1, paramInt2, paramString, 4))
      {
        AppMethodBeat.o(33889);
      }
      else
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break;
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
          Toast.makeText(this, paramString, 1).show();
        AppMethodBeat.o(33889);
      }
    }
    switch (paramm.getType())
    {
    default:
    case 138:
    }
    while (true)
    {
      AppMethodBeat.o(33889);
      break;
      dHV().notifyDataSetChanged();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(33893);
    this.gnG.remove(paramString);
    dHV().notifyDataSetChanged();
    Kt();
    AppMethodBeat.o(33893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI
 * JD-Core Version:    0.6.2
 */