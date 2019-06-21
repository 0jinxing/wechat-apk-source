package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.be;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.ui.widget.imageview.WeImageView;
import java.lang.ref.WeakReference;

public final class l extends b
{
  private View jyC;
  private View jyD;
  protected bd zwA;
  private TextView zwB;

  public l(Context paramContext, bd parambd)
  {
    super(paramContext);
    AppMethodBeat.i(34685);
    this.zwA = null;
    this.zwA = parambd;
    final int i;
    final int j;
    if (this.view != null)
    {
      this.jyC = this.view.findViewById(2131824110);
      this.jyD = this.view.findViewById(2131821629);
      paramContext = (WeImageView)this.view.findViewById(2131825736);
      paramContext.setIconColor(((Context)this.vlu.get()).getResources().getColor(2131690581));
      this.zwB = ((TextView)this.view.findViewById(2131825737));
      switch (this.zwA.type)
      {
      case 5:
      default:
        parambd = this.view;
        i = this.zwA.type;
        j = this.zwA.showType;
        switch (i)
        {
        case 5:
        default:
          paramContext = null;
        case 4:
        case 3:
        case 1:
        case 2:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      }
    }
    while (true)
    {
      parambd.setOnClickListener(paramContext);
      AppMethodBeat.o(34685);
      return;
      paramContext.setImageResource(2131231446);
      this.zwB.setText(2131297495);
      break;
      paramContext.setImageResource(2131231453);
      this.zwB.setText(2131299830);
      break;
      paramContext.setImageResource(2131231443);
      this.zwB.setText(2131297504);
      break;
      paramContext.setImageResource(2131232090);
      this.zwB.setText(2131297498);
      break;
      paramContext.setImageResource(2131232085);
      this.zwB.setText(2131297502);
      break;
      paramContext.setImageResource(2131232086);
      this.zwB.setText(2131297501);
      break;
      paramContext.setImageResource(2131232088);
      this.zwB.setText(2131297503);
      break;
      paramContext.setImageResource(2131232089);
      this.zwB.setText(2131297499);
      break;
      paramContext.setImageResource(2131232084);
      this.zwB.setText(2131297492);
      break;
      paramContext = new l.1(this, i, j);
      continue;
      paramContext = new l.2(this, i, j);
      continue;
      paramContext = new l.3(this, i, j);
      continue;
      paramContext = new l.4(this, i, j);
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(34680);
          be.ZV().co(i, j);
          paramAnonymousView = (Context)l.this.vlu.get();
          Intent localIntent = new Intent();
          localIntent.putExtra("preceding_scence", 17);
          d.b(paramAnonymousView, "emoji", ".ui.v2.EmojiStoreV2UI", localIntent);
          h.pYm.e(11002, new Object[] { Integer.valueOf(10), Integer.valueOf(1) });
          h.pYm.e(12065, new Object[] { Integer.valueOf(2) });
          AppMethodBeat.o(34680);
        }
      };
      continue;
      paramContext = new l.6(this, i, j);
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(34682);
          be.ZV().co(i, j);
          paramAnonymousView = (Context)l.this.vlu.get();
          int i;
          if ((r.YK() & 0x10000) == 0)
          {
            i = 1;
            if (i == 0)
              break label95;
            d.H(paramAnonymousView, "masssend", ".ui.MassSendHistoryUI");
          }
          while (true)
          {
            h.pYm.e(11002, new Object[] { Integer.valueOf(11), Integer.valueOf(1) });
            AppMethodBeat.o(34682);
            return;
            i = 0;
            break;
            label95: d.b(paramAnonymousView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", "masssendapp"));
          }
        }
      };
      continue;
      paramContext = new l.8(this, i, j);
      continue;
      paramContext = new l.9(this, i, j);
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(34686);
    if ((this.nfA) && (this.eVH))
    {
      this.jyD.setBackgroundResource(2130840456);
      this.jyC.setBackground(null);
      this.zwB.setBackground(null);
    }
    while (true)
    {
      boolean bool = super.aMN();
      AppMethodBeat.o(34686);
      return bool;
      if (this.nfA)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839164);
        this.zwB.setBackgroundResource(2130839162);
      }
      else if (this.eVH)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839162);
        this.zwB.setBackground(null);
      }
      else
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackground(null);
        this.zwB.setBackgroundResource(2130839162);
      }
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130970023;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(34687);
    if (this.jyC != null)
      this.jyC.setVisibility(paramInt);
    AppMethodBeat.o(34687);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.l
 * JD-Core Version:    0.6.2
 */