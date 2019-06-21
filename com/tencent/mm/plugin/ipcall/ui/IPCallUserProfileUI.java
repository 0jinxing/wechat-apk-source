package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.ipcall.a.e.e;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.g.m;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

public class IPCallUserProfileUI extends MMActivity
{
  private String cMQ;
  private String cOz;
  private ImageView eks;
  private boolean nBq;
  private TextView nFZ;
  private TextView nGa;
  private LinearLayout nGb;
  private LinearLayout nGc;
  private TextView nGd;
  private TextView nGe;
  private TextView nGf;
  private TextView nGg;
  private TextView nGh;
  private Button nGi;
  private String nGj;
  private String nGk;
  private Bitmap nGl;
  private boolean nGm;
  private Cursor nGn;
  private boolean nGo;
  private e nGp;

  public IPCallUserProfileUI()
  {
    AppMethodBeat.i(22384);
    this.nBq = false;
    this.nGn = null;
    this.nGo = false;
    this.nGp = new e();
    AppMethodBeat.o(22384);
  }

  // ERROR //
  private static String Pk(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 22388
    //   5: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 69	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   11: ldc 71
    //   13: invokestatic 76	com/tencent/mm/pluginsdk/permission/b:o	(Landroid/content/Context;Ljava/lang/String;)Z
    //   16: ifne +20 -> 36
    //   19: ldc 78
    //   21: ldc 80
    //   23: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: sipush 22388
    //   29: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_1
    //   33: astore_0
    //   34: aload_0
    //   35: areturn
    //   36: invokestatic 69	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   39: invokevirtual 92	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   42: getstatic 98	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   45: aconst_null
    //   46: ldc 100
    //   48: iconst_1
    //   49: anewarray 102	java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: aload_0
    //   55: aastore
    //   56: aconst_null
    //   57: invokevirtual 108	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   60: astore_2
    //   61: aload_2
    //   62: ifnonnull +14 -> 76
    //   65: sipush 22388
    //   68: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: aload_1
    //   72: astore_0
    //   73: goto -39 -> 34
    //   76: aload_2
    //   77: invokeinterface 114 1 0
    //   82: istore_3
    //   83: iload_3
    //   84: ifeq +153 -> 237
    //   87: ldc 116
    //   89: astore_0
    //   90: aload_0
    //   91: astore_1
    //   92: aload_0
    //   93: astore 4
    //   95: aload_2
    //   96: invokeinterface 119 1 0
    //   101: ifne +140 -> 241
    //   104: aload_0
    //   105: astore_1
    //   106: aload_2
    //   107: aload_2
    //   108: ldc 121
    //   110: invokeinterface 125 2 0
    //   115: invokeinterface 129 2 0
    //   120: astore 4
    //   122: aload_0
    //   123: astore_1
    //   124: new 131	java/lang/StringBuilder
    //   127: astore 5
    //   129: aload_0
    //   130: astore_1
    //   131: aload 5
    //   133: invokespecial 132	java/lang/StringBuilder:<init>	()V
    //   136: aload_0
    //   137: astore_1
    //   138: aload 5
    //   140: aload_0
    //   141: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload 4
    //   146: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: ldc 138
    //   151: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: astore_0
    //   158: aload_0
    //   159: astore_1
    //   160: aload_2
    //   161: invokeinterface 145 1 0
    //   166: pop
    //   167: goto -77 -> 90
    //   170: astore_0
    //   171: ldc 78
    //   173: ldc 147
    //   175: iconst_2
    //   176: anewarray 149	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_0
    //   182: invokevirtual 152	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   185: aastore
    //   186: dup
    //   187: iconst_1
    //   188: aload_0
    //   189: invokevirtual 156	java/lang/Object:getClass	()Ljava/lang/Class;
    //   192: invokevirtual 161	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   195: aastore
    //   196: invokestatic 164	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload_2
    //   200: invokeinterface 167 1 0
    //   205: aload_1
    //   206: astore_0
    //   207: aload_1
    //   208: ldc 138
    //   210: invokevirtual 170	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   213: iflt +15 -> 228
    //   216: aload_1
    //   217: iconst_0
    //   218: aload_1
    //   219: ldc 138
    //   221: invokevirtual 170	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   224: invokevirtual 174	java/lang/String:substring	(II)Ljava/lang/String;
    //   227: astore_0
    //   228: sipush 22388
    //   231: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: goto -200 -> 34
    //   237: ldc 116
    //   239: astore 4
    //   241: aload_2
    //   242: invokeinterface 167 1 0
    //   247: aload 4
    //   249: astore_1
    //   250: goto -45 -> 205
    //   253: astore_0
    //   254: aload_2
    //   255: invokeinterface 167 1 0
    //   260: sipush 22388
    //   263: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_0
    //   267: athrow
    //   268: astore_0
    //   269: ldc 116
    //   271: astore_1
    //   272: goto -101 -> 171
    //
    // Exception table:
    //   from	to	target	type
    //   95	104	170	java/lang/Exception
    //   106	122	170	java/lang/Exception
    //   124	129	170	java/lang/Exception
    //   131	136	170	java/lang/Exception
    //   138	158	170	java/lang/Exception
    //   160	167	170	java/lang/Exception
    //   76	83	253	finally
    //   95	104	253	finally
    //   106	122	253	finally
    //   124	129	253	finally
    //   131	136	253	finally
    //   138	158	253	finally
    //   160	167	253	finally
    //   171	199	253	finally
    //   76	83	268	java/lang/Exception
  }

  private void a(k paramk, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(22391);
    View localView = LayoutInflater.from(this).inflate(2130970414, this.nGc, false);
    TextView localTextView1 = (TextView)localView.findViewById(2131825141);
    TextView localTextView2 = (TextView)localView.findViewById(2131825142);
    TextView localTextView3 = (TextView)localView.findViewById(2131825143);
    localTextView2.setText(com.tencent.mm.plugin.ipcall.b.a.Pw(paramk.field_phonenumber));
    if (paramk.field_duration > 0L)
      localTextView3.setText(com.tencent.mm.plugin.ipcall.b.c.jc(paramk.field_duration));
    while (true)
    {
      localTextView1.setText(com.tencent.mm.plugin.ipcall.b.c.iY(paramk.field_calltime));
      if (paramBoolean)
      {
        localView.setBackgroundDrawable(getResources().getDrawable(2130839877));
        int i = getResources().getDimensionPixelSize(2131427446);
        localView.setPadding(i, 0, i, 0);
      }
      if (1 == paramInt)
      {
        paramk = (LinearLayout.LayoutParams)localView.getLayoutParams();
        paramk.height = com.tencent.mm.bz.a.al(this.mController.ylL, 2131428591);
        localView.setLayoutParams(paramk);
      }
      this.nGc.addView(localView);
      AppMethodBeat.o(22391);
      return;
      localTextView3.setText(com.tencent.mm.plugin.ipcall.b.c.xy(paramk.field_status));
    }
  }

  private void bIv()
  {
    int i = 0;
    AppMethodBeat.i(22386);
    ArrayList localArrayList = new ArrayList();
    if ((this.nGn != null) && (this.nGn.getCount() > 0));
    while (true)
    {
      try
      {
        String str;
        int j;
        if (this.nGn.moveToFirst())
          if (!this.nGn.isAfterLast())
          {
            i++;
            str = this.nGn.getString(this.nGn.getColumnIndex("data1"));
            j = this.nGn.getInt(this.nGn.getColumnIndex("data2"));
            if (!localArrayList.contains(str))
            {
              localArrayList.add(str);
              if (i == this.nGn.getCount())
                o(str, j, false);
            }
            else
            {
              this.nGn.moveToNext();
              continue;
            }
          }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IPCallUserProfileUI", "initPhoneNumberList error: %s", new Object[] { localException.getMessage() });
        return;
        o(str, j, true);
        continue;
      }
      finally
      {
        this.nGn.close();
        AppMethodBeat.o(22386);
      }
      this.nGn.close();
      AppMethodBeat.o(22386);
      continue;
      this.nGb.setVisibility(8);
      AppMethodBeat.o(22386);
    }
  }

  private void bIw()
  {
    AppMethodBeat.i(22389);
    this.nGi.setOnClickListener(new IPCallUserProfileUI.9(this));
    AppMethodBeat.o(22389);
  }

  private void bIx()
  {
    AppMethodBeat.i(22390);
    if (!this.nGo)
    {
      this.nGc.setVisibility(8);
      this.nGg.setVisibility(8);
    }
    Cursor localCursor;
    if (!bo.isNullOrNil(this.cOz))
    {
      localCursor = m.OW(this.cOz);
      if ((localCursor == null) || (localCursor.getCount() <= 0))
        break label253;
    }
    while (true)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          int i = 0;
          int j = i;
          if (!localCursor.isAfterLast())
          {
            k localk = new com/tencent/mm/plugin/ipcall/a/g/k;
            localk.<init>();
            localk.d(localCursor);
            i++;
            if (i < 3)
              break label280;
            bool = true;
            a(localk, bool, localCursor.getCount());
            j = i;
            if (!bool)
            {
              localCursor.moveToNext();
              continue;
            }
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IPCallUserProfileUI", "initRecordList, error: %s", new Object[] { localException.getMessage() });
        return;
        localCursor = i.bHx().OU(this.cMQ);
        break;
        if (j <= 0)
        {
          this.nGc.setVisibility(8);
          localCursor.close();
          AppMethodBeat.o(22390);
          continue;
        }
        if (localCursor.getCount() < 4)
          continue;
        bIy();
        continue;
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(22390);
      }
      label253: this.nGc.setVisibility(8);
      this.nGg.setVisibility(8);
      AppMethodBeat.o(22390);
      continue;
      label280: boolean bool = false;
    }
  }

  private void bIy()
  {
    AppMethodBeat.i(22392);
    View localView = LayoutInflater.from(this).inflate(2130970415, this.nGc, false);
    this.nGc.addView(localView);
    localView.setOnClickListener(new IPCallUserProfileUI.3(this));
    AppMethodBeat.o(22392);
  }

  private void o(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(22387);
    View localView = LayoutInflater.from(this).inflate(2130970412, this.nGb, false);
    Object localObject = (LinearLayout)localView.findViewById(2131826665);
    if (!paramBoolean)
      ((LinearLayout)localObject).setBackgroundDrawable(null);
    while (true)
    {
      TextView localTextView = (TextView)localView.findViewById(2131826666);
      localObject = (TextView)localView.findViewById(2131825079);
      ((TextView)localObject).setText(com.tencent.mm.plugin.ipcall.b.a.Pw(com.tencent.mm.plugin.ipcall.b.c.PA(paramString)));
      localTextView.setText(com.tencent.mm.plugin.ipcall.b.a.xx(paramInt));
      localView.setClickable(true);
      localView.setOnClickListener(new IPCallUserProfileUI.4(this, paramString));
      localView.setOnLongClickListener(new IPCallUserProfileUI.5(this, (TextView)localObject));
      this.nGb.addView(localView);
      AppMethodBeat.o(22387);
      return;
      ((LinearLayout)localObject).setBackgroundDrawable(getResources().getDrawable(2130839162));
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969891;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22394);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(22394);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22385);
    super.onCreate(paramBundle);
    h.pYm.e(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    setBackBtn(new IPCallUserProfileUI.1(this));
    setMMTitle(2131300754);
    this.eks = ((ImageView)findViewById(2131821183));
    this.nFZ = ((TextView)findViewById(2131825103));
    this.nGa = ((TextView)findViewById(2131825104));
    this.nGb = ((LinearLayout)findViewById(2131825107));
    this.nGd = ((TextView)findViewById(2131825110));
    this.nGf = ((TextView)findViewById(2131825109));
    this.nGe = ((TextView)findViewById(2131825108));
    this.nGc = ((LinearLayout)findViewById(2131825106));
    this.nGg = ((TextView)findViewById(2131825105));
    this.nGh = ((TextView)findViewById(2131825112));
    this.nGi = ((Button)findViewById(2131825111));
    this.cOz = getIntent().getStringExtra("IPCallProfileUI_contactid");
    this.nGj = getIntent().getStringExtra("IPCallProfileUI_systemUsername");
    this.nGk = getIntent().getStringExtra("IPCallProfileUI_wechatUsername");
    this.cMQ = getIntent().getStringExtra("IPCallProfileUI_phonenumber");
    this.nGo = getIntent().getBooleanExtra("IPCallProfileUI_isNeedShowRecord", false);
    if (!bo.isNullOrNil(this.cOz))
    {
      this.nGl = com.tencent.mm.plugin.ipcall.b.a.aH(this, this.cOz);
      if (this.nGl != null)
        this.eks.setImageBitmap(this.nGl);
    }
    if ((this.nGl == null) && (!bo.isNullOrNil(this.nGk)))
    {
      this.nGl = com.tencent.mm.ah.b.a(this.nGk, false, -1);
      if (this.nGl != null)
        this.eks.setImageBitmap(this.nGl);
    }
    if (!bo.isNullOrNil(this.nGj))
    {
      this.nFZ.setText(this.nGj);
      if ((bo.isNullOrNil(this.nGk)) || (this.nGk.endsWith("@stranger")))
        break label537;
      paramBundle = getString(2131300755, new Object[] { s.mJ(this.nGk) });
      this.nGa.setText(j.b(this, paramBundle));
    }
    label509: boolean bool;
    while (true)
      if (!bo.isNullOrNil(this.cOz))
      {
        if (!com.tencent.mm.pluginsdk.permission.b.o(this, "android.permission.READ_CONTACTS"))
        {
          ab.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
          AppMethodBeat.o(22385);
          return;
          if (bo.isNullOrNil(this.cMQ))
            break label742;
          this.nFZ.setText(com.tencent.mm.plugin.ipcall.b.a.Pw(this.cMQ));
          break;
          label537: this.nGa.setVisibility(8);
          continue;
        }
        this.nGn = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new String[] { this.cOz }, null);
        if (this.nGn.getCount() > 1)
          break label744;
        bool = true;
        label593: this.nBq = bool;
      }
    bIx();
    this.nGf.setVisibility(8);
    this.nGe.setVisibility(8);
    this.nGd.setVisibility(8);
    this.nGi.setVisibility(8);
    this.nGh.setVisibility(8);
    if ((!bo.isNullOrNil(this.nGk)) && (!bo.isNullOrNil(this.nGj)))
    {
      aw.ZK();
      paramBundle = com.tencent.mm.model.c.XM().aoO(this.nGk);
      if ((paramBundle != null) && (!com.tencent.mm.n.a.jh(paramBundle.field_type)))
      {
        this.nGi.setOnClickListener(new IPCallUserProfileUI.8(this));
        this.nGi.setText(2131300747);
        this.nGi.setVisibility(0);
      }
    }
    while (true)
    {
      bIv();
      AppMethodBeat.o(22385);
      break label509;
      label742: break;
      label744: bool = false;
      break label593;
      if ((!bo.isNullOrNil(this.cOz)) && (!bo.isNullOrNil(this.nGj)))
      {
        bIw();
        this.nGi.setText(2131300752);
      }
      else if (!bo.isNullOrNil(this.cMQ))
      {
        this.nGe.setVisibility(0);
        this.nGf.setVisibility(0);
        Context localContext = ah.getContext();
        paramBundle = new Intent("android.intent.action.INSERT");
        paramBundle.setType("vnd.android.cursor.dir/contact");
        paramBundle.putExtra("phone", "10086");
        if (bo.k(localContext, paramBundle))
          this.nGd.setVisibility(0);
        this.nGd.setOnClickListener(new IPCallUserProfileUI.10(this));
        this.nGe.setOnClickListener(new IPCallUserProfileUI.11(this));
        this.nGf.setOnClickListener(new IPCallUserProfileUI.2(this));
        bIw();
        this.nGi.setText(2131300752);
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(22393);
    super.onResume();
    if (this.nGm)
    {
      this.nGm = false;
      this.nGc.removeAllViews();
      bIx();
    }
    AppMethodBeat.o(22393);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI
 * JD-Core Version:    0.6.2
 */