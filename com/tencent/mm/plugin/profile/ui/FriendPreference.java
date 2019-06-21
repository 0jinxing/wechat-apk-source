package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import junit.framework.Assert;

public class FriendPreference extends Preference
  implements d.a
{
  private int cHJ;
  private MMActivity crP;
  private ad ehM;
  private TextView gne;
  private String gta;
  private boolean lyb;
  private long pnA;
  private TextView pnu;
  private ImageView pnv;
  private ImageView pnw;
  private com.tencent.mm.plugin.account.friend.a.a pnx;
  private String pny;
  private long pnz;

  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23622);
    this.crP = ((MMActivity)paramContext);
    init();
    AppMethodBeat.o(23622);
  }

  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23623);
    setLayoutResource(2130970127);
    setWidgetLayoutResource(2130970202);
    init();
    AppMethodBeat.o(23623);
  }

  private void cbg()
  {
    AppMethodBeat.i(23627);
    if ((this.ehM == null) || (!this.lyb))
    {
      ab.d("MicroMsg.FriendPreference", "initView : contact = " + this.ehM + " bindView = " + this.lyb);
      AppMethodBeat.o(23627);
      return;
    }
    this.cHJ = 3;
    this.gne.setText(this.mContext.getString(2131300452));
    this.pnu.setText(bo.nullAsNil(this.ehM.dtT));
    Object localObject1 = b.pS(this.pnA);
    Object localObject4;
    Object localObject5;
    if (localObject1 == null)
    {
      localObject4 = null;
      localObject5 = null;
    }
    while (true)
      try
      {
        while (true)
        {
          InputStream localInputStream = this.mContext.getResources().openRawResource(2131231191);
          localObject5 = localInputStream;
          localObject4 = localInputStream;
          Bitmap localBitmap = com.tencent.mm.compatible.g.a.decodeStream(localInputStream);
          localObject4 = localBitmap;
          localObject1 = localObject4;
          if (localInputStream != null);
          try
          {
            localInputStream.close();
            localObject1 = localObject4;
            if (localObject1 != null)
            {
              localObject4 = Bitmap.createScaledBitmap((Bitmap)localObject1, 48, 48, false);
              if (localObject4 != localObject1)
              {
                ab.i("MicroMsg.FriendPreference", "bitmap recycle %s", new Object[] { localObject1.toString() });
                ((Bitmap)localObject1).recycle();
              }
              localObject1 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject4, true, 0.0F);
              this.pnv.setImageBitmap((Bitmap)localObject1);
            }
            aw.ZK();
            if (!c.isSDCardAvailable())
              this.pnv.setBackgroundDrawable(com.tencent.mm.bz.a.g(this.crP, 2131231172));
            AppMethodBeat.o(23627);
          }
          catch (Exception localException1)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.FriendPreference", localException1, "", new Object[0]);
              Object localObject2 = localObject4;
            }
          }
        }
      }
      catch (Exception localException4)
      {
        localObject4 = localObject5;
        ab.printErrStackTrace("MicroMsg.FriendPreference", localException4, "", new Object[0]);
        if (localObject5 != null)
          try
          {
            localObject5.close();
          }
          catch (Exception localException2)
          {
            ab.printErrStackTrace("MicroMsg.FriendPreference", localException2, "", new Object[0]);
          }
      }
      finally
      {
        if (localException2 != null);
        try
        {
          localException2.close();
          AppMethodBeat.o(23627);
          throw localObject3;
        }
        catch (Exception localException3)
        {
          ab.printErrStackTrace("MicroMsg.FriendPreference", localException3, "", new Object[0]);
        }
      }
  }

  private void cbh()
  {
    AppMethodBeat.i(23628);
    if ((this.ehM == null) || (!this.lyb))
    {
      ab.d("MicroMsg.FriendPreference", "initView : contact = " + this.ehM + " bindView = " + this.lyb);
      AppMethodBeat.o(23628);
      return;
    }
    this.cHJ = 2;
    this.gne.setText(this.mContext.getString(2131298540));
    Object localObject1 = bo.nullAsNil(this.pny);
    localObject1 = (String)localObject1 + " " + new p(this.pnz).longValue();
    this.pnu.setText((CharSequence)localObject1);
    localObject1 = b.fr(this.pnz);
    Object localObject4;
    Object localObject5;
    if (localObject1 == null)
    {
      localObject4 = null;
      localObject5 = null;
    }
    while (true)
      try
      {
        while (true)
        {
          InputStream localInputStream = this.mContext.getResources().openRawResource(2131231191);
          localObject5 = localInputStream;
          localObject4 = localInputStream;
          Bitmap localBitmap = com.tencent.mm.compatible.g.a.decodeStream(localInputStream);
          localObject4 = localBitmap;
          localObject1 = localObject4;
          if (localInputStream != null);
          try
          {
            localInputStream.close();
            localObject1 = localObject4;
            if (localObject1 != null)
            {
              localObject4 = Bitmap.createScaledBitmap((Bitmap)localObject1, 48, 48, false);
              if (localObject4 != localObject1)
              {
                ab.i("MicroMsg.FriendPreference", "bitmap recycle %s", new Object[] { localObject1.toString() });
                ((Bitmap)localObject1).recycle();
              }
              localObject1 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject4, true, 0.0F);
              this.pnv.setImageBitmap((Bitmap)localObject1);
            }
            aw.ZK();
            if (!c.isSDCardAvailable())
              this.pnv.setBackgroundDrawable(com.tencent.mm.bz.a.g(this.crP, 2131231172));
            AppMethodBeat.o(23628);
          }
          catch (Exception localException1)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.FriendPreference", localException1, "", new Object[0]);
              Object localObject2 = localObject4;
            }
          }
        }
      }
      catch (Exception localException4)
      {
        localObject4 = localObject5;
        ab.printErrStackTrace("MicroMsg.FriendPreference", localException4, "", new Object[0]);
        if (localObject5 != null)
          try
          {
            localObject5.close();
          }
          catch (Exception localException2)
          {
            ab.printErrStackTrace("MicroMsg.FriendPreference", localException2, "", new Object[0]);
          }
      }
      finally
      {
        if (localException2 != null);
        try
        {
          localException2.close();
          AppMethodBeat.o(23628);
          throw localObject3;
        }
        catch (Exception localException3)
        {
          ab.printErrStackTrace("MicroMsg.FriendPreference", localException3, "", new Object[0]);
        }
      }
  }

  private void cbi()
  {
    AppMethodBeat.i(23629);
    if ((this.ehM == null) || (!this.lyb))
    {
      ab.d("MicroMsg.FriendPreference", "initView : contact = " + this.ehM + " bindView = " + this.lyb);
      AppMethodBeat.o(23629);
    }
    while (true)
    {
      return;
      if (this.pnx == null)
      {
        AppMethodBeat.o(23629);
      }
      else
      {
        this.cHJ = 1;
        this.gne.setText(this.mContext.getString(2131298539));
        String str = bo.nullAsNil(this.pnx.apA()) + " " + bo.nullAsNil(this.pnx.apG()).replace(" ", "");
        this.pnu.setText(str);
        Bitmap localBitmap = l.b(this.pnx.apz(), this.mContext);
        if (localBitmap == null)
          this.pnv.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2131231186));
        while (true)
        {
          aw.ZK();
          if (!c.XM().aoJ(this.pnx.getUsername()))
            break label270;
          this.pnw.setOnClickListener(new FriendPreference.1(this, str));
          AppMethodBeat.o(23629);
          break;
          localBitmap = com.tencent.mm.sdk.platformtools.d.a(Bitmap.createScaledBitmap(localBitmap, 48, 48, false), true, 0.0F);
          this.pnv.setImageBitmap(localBitmap);
        }
        label270: this.pnw.setVisibility(4);
        AppMethodBeat.o(23629);
      }
    }
  }

  private void cbj()
  {
    AppMethodBeat.i(23630);
    if ((this.ehM == null) || (!this.lyb))
    {
      ab.d("MicroMsg.FriendPreference", "initView : contact = " + this.ehM + " bindView = " + this.lyb);
      AppMethodBeat.o(23630);
    }
    while (true)
    {
      return;
      this.cHJ = 3;
      this.gne.setText(this.mContext.getString(2131302224));
      this.pnu.setText(bo.nullAsNil(this.gta));
      this.pnv.setVisibility(8);
      AppMethodBeat.o(23630);
    }
  }

  private void init()
  {
    this.lyb = false;
    this.ehM = null;
    this.pnx = null;
    this.pny = "";
    this.pnz = 0L;
    this.pnA = 0L;
    this.cHJ = 0;
    this.gta = "";
  }

  private void initView()
  {
    AppMethodBeat.i(23626);
    if ((this.ehM == null) || (!this.lyb))
    {
      ab.d("MicroMsg.FriendPreference", "initView : contact = " + this.ehM + " bindView = " + this.lyb);
      AppMethodBeat.o(23626);
    }
    while (true)
    {
      return;
      if ((this.pnz != -1L) && (new p(this.pnz).longValue() > 0L))
      {
        setWidgetLayoutResource(2130970203);
        cbh();
        AppMethodBeat.o(23626);
      }
      else if (this.pnx != null)
      {
        setWidgetLayoutResource(2130970194);
        cbi();
        AppMethodBeat.o(23626);
      }
      else if (this.pnA > 0L)
      {
        cbg();
        AppMethodBeat.o(23626);
      }
      else if (!TextUtils.isEmpty(this.gta))
      {
        cbj();
        AppMethodBeat.o(23626);
      }
      else
      {
        Assert.assertTrue(false);
        AppMethodBeat.o(23626);
      }
    }
  }

  private boolean q(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(23631);
    boolean bool;
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      bool = l.a(paramString, this.mContext, localByteArrayOutputStream.toByteArray());
      AppMethodBeat.o(23631);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23631);
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23632);
    o.acd().e(this);
    AppMethodBeat.o(23632);
    return true;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23625);
    this.gne = ((TextView)paramView.findViewById(2131820678));
    this.pnu = ((TextView)paramView.findViewById(2131821841));
    this.pnv = ((ImageView)paramView.findViewById(2131822184));
    this.pnw = ((ImageView)paramView.findViewById(2131826074));
    this.lyb = true;
    initView();
    super.onBindView(paramView);
    AppMethodBeat.o(23625);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23624);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970148, localViewGroup);
    AppMethodBeat.o(23624);
    return paramViewGroup;
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(23633);
    long l = b.pU(paramString);
    if ((l > 0L) && (this.pnz == l) && (b.a(paramString, false, -1) != null))
      initView();
    if ((b.pT(paramString) == this.pnA) && (b.a(paramString, false, -1) != null))
      initView();
    AppMethodBeat.o(23633);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.FriendPreference
 * JD-Core Version:    0.6.2
 */