package com.tencent.mm.ui.chatting.c;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.b;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.pluginsdk.ui.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.HashMap;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.c.class)
public class f extends a
  implements com.tencent.mm.ui.chatting.c.b.c
{
  private static HashMap<String, e> yOG;
  private e pFf;
  private Bitmap yOD;
  private ImageView yOE;
  private final k.a yOF;

  static
  {
    AppMethodBeat.i(31286);
    yOG = new HashMap();
    AppMethodBeat.o(31286);
  }

  public f()
  {
    AppMethodBeat.i(31277);
    this.yOF = new f.1(this);
    this.pFf = null;
    AppMethodBeat.o(31277);
  }

  private boolean bS(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(31282);
    if (yOG.containsKey(paramString))
    {
      this.pFf = ((e)yOG.get(paramString));
      AppMethodBeat.o(31282);
      bool = true;
    }
    while (true)
    {
      return bool;
      try
      {
        paramContext = bo.convertStreamToString(paramContext.getAssets().open(paramString));
        e locale = new com/tencent/mm/pluginsdk/ui/e;
        locale.<init>(paramContext);
        this.pFf = locale;
        yOG.put(paramString, this.pFf);
        AppMethodBeat.o(31282);
        bool = true;
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.ChattingUI.ChattingBackgroundComponent", paramContext, "", new Object[0]);
        AppMethodBeat.o(31282);
      }
    }
  }

  private void dDH()
  {
    AppMethodBeat.i(31279);
    if ((this.yOD != null) && (!this.yOD.isRecycled()))
    {
      ab.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "recycle bitmap:%s", new Object[] { this.yOD.toString() });
      this.yOD.recycle();
    }
    if (this.yOE != null)
      this.yOE.setImageBitmap(null);
    AppMethodBeat.o(31279);
  }

  private int dDI()
  {
    AppMethodBeat.i(31280);
    int i = this.cgL.yTx.getMMResources().getColor(2131689875);
    AppMethodBeat.o(31280);
    return i;
  }

  private void setBackgroundColor(int paramInt)
  {
    AppMethodBeat.i(31281);
    dDH();
    if (this.yOE == null)
    {
      View localView = this.cgL.findViewById(2131821521);
      if (localView != null)
        localView.setBackgroundColor(paramInt);
      AppMethodBeat.o(31281);
    }
    while (true)
    {
      return;
      this.yOE.setImageDrawable(new ColorDrawable(paramInt));
      AppMethodBeat.o(31281);
    }
  }

  public final void cZH()
  {
    AppMethodBeat.i(31278);
    com.tencent.mm.ba.a locala = r.aiy().sU(this.cgL.getTalkerUserName());
    int i;
    if (locala == null)
    {
      aw.ZK();
      i = ((Integer)com.tencent.mm.model.c.Ry().get(12311, Integer.valueOf(-2))).intValue();
      if (i != -2)
        break label95;
      setBackgroundColor(dDI());
      bS(this.cgL.yTx.getContext(), "chatting/purecolor_chat.xml");
      AppMethodBeat.o(31278);
    }
    while (true)
    {
      return;
      i = locala.fLV;
      break;
      label95: r.aix();
      int j = n.cb(this.cgL.yTx.getContext());
      if (i == 0)
        switch (j)
        {
        default:
          i = -1;
          if (i != -1)
            dDH();
          break;
        case 1:
        case 2:
        case 3:
        case 4:
        }
      try
      {
        this.yOD = BitmapFactory.decodeResource(this.cgL.yTx.getMMResources(), 2130838253);
        label178: if (this.yOD == null)
        {
          ab.e("MicroMsg.ChattingUI.ChattingBackgroundComponent", "setBackground decodeFile fail, bm is null, resId = 2130838253");
          setBackgroundColor(this.cgL.yTx.getMMResources().getColor(2131689875));
          bS(this.cgL.yTx.getContext(), "chatting/reserved_chat.xml");
          AppMethodBeat.o(31278);
          continue;
          i = 2130838253;
        }
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
          localObject = (IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError);
          AppMethodBeat.o(31278);
          throw ((Throwable)localObject);
          if (this.yOE == null)
            this.yOE = ((ImageView)this.cgL.findViewById(2131822397));
          if (this.yOE != null)
            this.yOE.setImageBitmap(this.yOD);
        }
        Object localObject = r.aix();
        if (i > 0)
        {
          bS(this.cgL.yTx.getContext(), "chatting/default_chat.xml");
          switch (j)
          {
          default:
            localObject = null;
          case 1:
          case 2:
          case 3:
          case 4:
          }
        }
        while (true)
        {
          dDH();
          this.yOD = x.vv((String)localObject);
          if (this.yOD != null)
            break label626;
          ab.e("MicroMsg.ChattingUI.ChattingBackgroundComponent", "setBackground decodeFile fail, bm is null, path = ".concat(String.valueOf(localObject)));
          setBackgroundColor(dDI());
          AppMethodBeat.o(31278);
          break;
          localObject = ((n)localObject).cy(i, 1) + "horizontal_hdpi.jpg";
          continue;
          localObject = ((n)localObject).cy(i, 1) + "horizontal_ldpi.jpg";
          continue;
          localObject = ((n)localObject).cy(i, 1) + "vertical_hdpi.jpg";
          continue;
          localObject = ((n)localObject).cy(i, 1) + "vertical_ldpi.jpg";
          continue;
          bS(this.cgL.yTx.getContext(), "chatting/default_chat.xml");
          if (locala == null)
            localObject = n.Z("default", j);
          else
            localObject = n.Z(this.cgL.getTalkerUserName(), j);
        }
        if (this.yOE == null)
          this.yOE = ((ImageView)this.cgL.findViewById(2131822397));
        if (this.yOE != null)
          this.yOE.setImageBitmap(this.yOD);
        AppMethodBeat.o(31278);
      }
      catch (Throwable localThrowable)
      {
        label626: break label178;
      }
    }
  }

  public final e dDJ()
  {
    return this.pFf;
  }

  public final void dxA()
  {
  }

  public final void dxB()
  {
  }

  public final void dxD()
  {
    AppMethodBeat.i(31285);
    ab.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingExitAnimEnd]");
    if (aw.RK())
    {
      r.aiy().d(this.yOF);
      r.aix().d(this.yOF);
    }
    dDH();
    AppMethodBeat.o(31285);
  }

  public final void dxx()
  {
  }

  public final void dxy()
  {
    AppMethodBeat.i(31283);
    ab.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingEnterAnimStart]");
    cZH();
    AppMethodBeat.o(31283);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31284);
    r.aiy().c(this.yOF);
    r.aix().c(this.yOF);
    AppMethodBeat.o(31284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.f
 * JD-Core Version:    0.6.2
 */