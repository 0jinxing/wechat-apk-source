package com.tencent.mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.method.ScrollingMovementMethod;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.by;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.z;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteDebug.IOTraceStats;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class c
  implements a
{
  private d kHL;
  private HandlerThread kHM = null;
  private Handler kHN = null;

  c(d paramd)
  {
    this.kHL = paramd;
  }

  private boolean b(final Context paramContext, String[] paramArrayOfString)
  {
    int i = -1;
    int j = 0;
    boolean bool = false;
    AppMethodBeat.i(18939);
    Object localObject1 = com.tencent.mm.kernel.g.RP().cachePath;
    final String str1 = (String)localObject1 + "ctest/";
    localObject1 = (String)localObject1 + "EnMicroMsg.db";
    final String str2 = str1 + "EnMicroMsg.db";
    Object localObject2 = new String[5];
    localObject2[0] = "";
    localObject2[1] = "-journal";
    localObject2[2] = "-wal";
    localObject2[3] = ".sm";
    localObject2[4] = ".bak";
    if (paramArrayOfString.length > 1)
    {
      paramArrayOfString = paramArrayOfString[1];
      switch (paramArrayOfString.hashCode())
      {
      default:
        switch (i)
        {
        default:
          AppMethodBeat.o(18939);
        case 0:
        case 1:
        case 2:
        }
        break;
      case 1220142353:
      case 1933703003:
      case -778987502:
      }
    }
    while (true)
    {
      return bool;
      if (!paramArrayOfString.equals("make-test"))
        break;
      i = 0;
      break;
      if (!paramArrayOfString.equals("recover-test"))
        break;
      i = 1;
      break;
      if (!paramArrayOfString.equals("clear-test"))
        break;
      i = 2;
      break;
      if (com.tencent.mm.vfs.e.ct(str1))
      {
        Toast.makeText(paramContext, "Corruption test database exists.\nClear or recover before creating a new one.", 1).show();
        AppMethodBeat.o(18939);
        bool = true;
      }
      else
      {
        aw.ZK();
        com.tencent.mm.model.c.Ru().dvx().close();
        com.tencent.mm.vfs.e.tf(str1);
        for (i = j; i < 5; i++)
        {
          paramArrayOfString = localObject2[i];
          com.tencent.mm.vfs.e.aQ((String)localObject1 + paramArrayOfString, str2 + paramArrayOfString);
        }
        d.dB(paramContext);
        AppMethodBeat.o(18939);
        bool = true;
        continue;
        if (!com.tencent.mm.vfs.e.ct(str1))
        {
          Toast.makeText(paramContext, "Corruption test database not exist.", 0).show();
          AppMethodBeat.o(18939);
          bool = true;
        }
        else
        {
          com.tencent.mm.ui.base.h.a(paramContext, "Do you really want to recover test database?\nYour current database WILL BE LOST.", null, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(18935);
              aw.ZK();
              com.tencent.mm.model.c.Ru().dvx().close();
              for (String str : this.kHW)
              {
                com.tencent.mm.vfs.e.deleteFile(this.kHX + str);
                com.tencent.mm.vfs.e.aQ(str2 + str, this.kHX + str);
              }
              com.tencent.mm.vfs.e.N(str1, true);
              d.dB(paramContext);
              AppMethodBeat.o(18935);
            }
          }
          , null);
          AppMethodBeat.o(18939);
          bool = true;
          continue;
          if (!com.tencent.mm.vfs.e.ct(str1))
          {
            Toast.makeText(paramContext, "Corruption test database not exist.", 0).show();
            AppMethodBeat.o(18939);
            bool = true;
          }
          else
          {
            com.tencent.mm.ui.base.h.a(paramContext, "Do you really want to clear test database?\nIt can't be recovered anymore.", null, new c.6(this, str1, paramContext), null);
            AppMethodBeat.o(18939);
            bool = true;
            continue;
            localObject1 = new StringBuilder(512);
            localObject2 = com.tencent.mm.kernel.g.RP().Rs();
            ((StringBuilder)localObject1).append("Corrupted DB: ");
            if (localObject2 != null)
              break label652;
            ((StringBuilder)localObject1).append("not exist");
            paramArrayOfString = new TextView(paramContext);
            paramArrayOfString.setText((CharSequence)localObject1);
            paramArrayOfString.setGravity(8388627);
            paramArrayOfString.setTextSize(1, 10.0F);
            paramArrayOfString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            paramArrayOfString.setTextColor(-16744704);
            paramArrayOfString.setTypeface(Typeface.MONOSPACE);
            paramArrayOfString.setMovementMethod(new ScrollingMovementMethod());
            i = paramContext.getResources().getDimensionPixelSize(2131427776);
            paramArrayOfString.setPadding(i, i, i, i);
            com.tencent.mm.ui.base.h.a(paramContext, null, paramArrayOfString, null);
            AppMethodBeat.o(18939);
            bool = true;
          }
        }
      }
    }
    label652: if (((String)localObject2).contains("/ctest/"));
    for (paramArrayOfString = "test"; ; paramArrayOfString = "exists")
    {
      ((StringBuilder)localObject1).append(paramArrayOfString);
      ((StringBuilder)localObject1).append("\nCorrupted DB size: ").append(com.tencent.mm.vfs.e.asZ((String)localObject2));
      ((StringBuilder)localObject1).append("\nSaved master exists: ").append(com.tencent.mm.vfs.e.ct((String)localObject2 + ".sm"));
      ((StringBuilder)localObject1).append("\nContent backup exists: ").append(com.tencent.mm.vfs.e.ct((String)localObject2 + ".bak"));
      break;
    }
  }

  private static boolean c(Context paramContext, String[] paramArrayOfString)
  {
    AppMethodBeat.i(18941);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    int i;
    if (paramArrayOfString.length > 1)
      try
      {
        i = Integer.decode(paramArrayOfString[1]).intValue();
        if ((i > 2) || (i < 0))
        {
          paramArrayOfString = new java/lang/NumberFormatException;
          paramArrayOfString.<init>();
          AppMethodBeat.o(18941);
          throw paramArrayOfString;
        }
      }
      catch (NumberFormatException paramArrayOfString)
      {
        paramArrayOfString = "Recovery status must be 0, 1 or 2";
      }
    while (true)
    {
      Toast.makeText(paramContext, paramArrayOfString, 0).show();
      AppMethodBeat.o(18941);
      return true;
      localz.set(89, Integer.valueOf(i));
      localz.dsb();
      paramArrayOfString = "Recovery status set to ".concat(String.valueOf(i));
      continue;
      paramArrayOfString = "Recovery status is ".concat(String.valueOf(localz.getInt(89, 0)));
    }
  }

  private static boolean dA(Context paramContext)
  {
    AppMethodBeat.i(18940);
    int i = SQLiteDebug.getLastErrorLine();
    Object localObject1 = SQLiteDebug.getLastIOTraceStats();
    if ((localObject1 == null) || (((ArrayList)localObject1).isEmpty()))
      AppMethodBeat.o(18940);
    while (true)
    {
      return true;
      Object localObject2 = (SQLiteDebug.IOTraceStats)((ArrayList)localObject1).get(0);
      localObject1 = "";
      try
      {
        aw.ZK();
        int j = com.tencent.mm.model.c.QF();
        String str1 = q.LK();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str1 = com.tencent.mm.a.g.x((str1 + j).getBytes()).substring(0, 7);
        localObject1 = str1;
        localObject3 = String.format("DB corrupted (line: %d, hash: %s) => %s", new Object[] { Integer.valueOf(i), localObject1, ((SQLiteDebug.IOTraceStats)localObject2).toString() });
        localObject1 = "";
        if (((SQLiteDebug.IOTraceStats)localObject2).lastReadPage != null)
          localObject1 = Base64.encodeToString(((SQLiteDebug.IOTraceStats)localObject2).lastReadPage, 0);
        if (((SQLiteDebug.IOTraceStats)localObject2).lastJournalReadPage != null)
        {
          str1 = Base64.encodeToString(((SQLiteDebug.IOTraceStats)localObject2).lastJournalReadPage, 0);
          localObject2 = new HashMap();
          ((HashMap)localObject2).put("lastReadPage", localObject1);
          ((HashMap)localObject2).put("lastJournalReadPage", str1);
          com.tencent.mm.plugin.report.service.h.pYm.g("DBCorrupt", (String)localObject3, (Map)localObject2);
          localObject1 = new TextView(paramContext);
          ((TextView)localObject1).setText((CharSequence)localObject3);
          ((TextView)localObject1).setGravity(8388627);
          ((TextView)localObject1).setTextSize(1, 10.0F);
          ((TextView)localObject1).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
          ((TextView)localObject1).setTextColor(-16744704);
          ((TextView)localObject1).setTypeface(Typeface.MONOSPACE);
          ((TextView)localObject1).setMovementMethod(new ScrollingMovementMethod());
          i = paramContext.getResources().getDimensionPixelSize(2131427776);
          ((TextView)localObject1).setPadding(i, i, i, i);
          com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject1, null);
          AppMethodBeat.o(18940);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          continue;
          String str2 = "";
        }
      }
    }
  }

  private boolean dz(Context paramContext)
  {
    AppMethodBeat.i(18938);
    if (com.tencent.mm.kernel.g.RP().Rs() == null)
    {
      com.tencent.mm.ui.base.h.g(paramContext, 2131302213, 2131297061);
      AppMethodBeat.o(18938);
    }
    while (true)
    {
      return true;
      paramContext.getString(2131297061);
      Object localObject1 = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131302212), false, null);
      Object localObject2 = ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.b.class)).dgK();
      ((by)localObject2).aaw();
      Object localObject3 = this.kHL;
      localObject1 = new c.1(this, (by)localObject2, (ProgressDialog)localObject1, paramContext);
      paramContext = new com.tencent.mm.vfs.b(ah.getContext().getFilesDir(), "DBRecoverStarted");
      localObject2 = new WakerLock(ah.getContext(), "MicroMsg.SubCoreDBBackup");
      localObject3 = new d.5((d)localObject3, paramContext, (b)localObject1, (WakerLock)localObject2);
      ab.i("MicroMsg.SubCoreDBBackup", "Database recover started.");
      ((WakerLock)localObject2).lock();
      com.tencent.mm.plugin.report.service.h.pYm.a(181L, 28L, 1L, true);
      try
      {
        paramContext.createNewFile();
        label171: ((b)localObject3).tL(-1);
        AppMethodBeat.o(18938);
      }
      catch (IOException paramContext)
      {
        break label171;
      }
    }
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(18942);
    paramString = paramArrayOfString[0];
    int i = -1;
    boolean bool2;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        AppMethodBeat.o(18942);
        bool2 = false;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      break;
    case 1483443294:
    case -1955673212:
    case -1648083177:
    case -1870250080:
    case 1793722114:
    case -137452885:
    case -398050965:
    case -896707907:
    case -1832373669:
    case 2027162967:
    }
    while (true)
    {
      return bool2;
      if (!paramString.equals("//recover-old"))
        break;
      i = 0;
      break;
      if (!paramString.equals("//recover"))
        break;
      i = 1;
      break;
      if (!paramString.equals("//post-recover"))
        break;
      i = 2;
      break;
      if (!paramString.equals("//backupdb"))
        break;
      i = 3;
      break;
      if (!paramString.equals("//recoverdb"))
        break;
      i = 4;
      break;
      if (!paramString.equals("//repairdb"))
        break;
      i = 5;
      break;
      if (!paramString.equals("//corruptdb"))
        break;
      i = 6;
      break;
      if (!paramString.equals("//iotracedb"))
        break;
      i = 7;
      break;
      if (!paramString.equals("//recover-status"))
        break;
      i = 8;
      break;
      if (!paramString.equals("//dbbusy"))
        break;
      i = 9;
      break;
      bool2 = dz(paramContext);
      AppMethodBeat.o(18942);
      continue;
      paramArrayOfString = new Intent(paramContext, DBRecoveryUI.class);
      paramArrayOfString.putExtra("scene", 2);
      paramArrayOfString.setFlags(268435456);
      paramContext.startActivity(paramArrayOfString);
      AppMethodBeat.o(18942);
      bool2 = bool1;
      continue;
      aw.ZK();
      d.bhR();
      Toast.makeText(paramContext, "Post recovery cleanup done.", 0).show();
      AppMethodBeat.o(18942);
      bool2 = bool1;
      continue;
      if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].equals("cipher")))
      {
        aw.ZK();
        paramString = com.tencent.mm.model.c.Ry();
        if (paramArrayOfString.length > 2)
        {
          paramArrayOfString = paramArrayOfString[2];
          i = -1;
        }
        switch (paramArrayOfString.hashCode())
        {
        default:
          switch (i)
          {
          default:
            label540: label580: if (paramString.getInt(237571, 0) != 0);
            break;
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          }
          break;
        case 119527:
        case 3551:
        case 49:
        case 3521:
        case 109935:
        case 48:
        }
        for (bool2 = true; ; bool2 = false)
        {
          Toast.makeText(paramContext, "Database backup with cipher: ".concat(String.valueOf(bool2)), 0).show();
          AppMethodBeat.o(18942);
          bool2 = bool1;
          break;
          if (!paramArrayOfString.equals("yes"))
            break label540;
          i = 0;
          break label540;
          if (!paramArrayOfString.equals("on"))
            break label540;
          i = 1;
          break label540;
          if (!paramArrayOfString.equals("1"))
            break label540;
          i = 2;
          break label540;
          if (!paramArrayOfString.equals("no"))
            break label540;
          i = 3;
          break label540;
          if (!paramArrayOfString.equals("off"))
            break label540;
          i = 4;
          break label540;
          if (!paramArrayOfString.equals("0"))
            break label540;
          i = 5;
          break label540;
          paramString.setInt(237571, 0);
          paramString.dsb();
          break label580;
          paramString.setInt(237571, 1);
          paramString.dsb();
          break label580;
        }
      }
      if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].equals("incremental")));
      long l;
      for (bool2 = true; ; bool2 = false)
      {
        l = System.nanoTime();
        paramArrayOfString = com.tencent.mm.ui.base.h.b(paramContext, "Backing database up. Please wait...", false, null);
        if (this.kHL.a(bool2, new c.2(this, paramArrayOfString, bool2, l, paramContext)))
          break;
        if (paramArrayOfString != null)
          paramArrayOfString.dismiss();
        Toast.makeText(paramContext, "Database is busy.", 0).show();
        break;
      }
      if (paramArrayOfString.length > 1);
      for (paramArrayOfString = paramArrayOfString[1]; ; paramArrayOfString = null)
      {
        l = System.nanoTime();
        paramContext.getString(2131297061);
        paramString = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131302212), false, null);
        this.kHL.a(paramArrayOfString, new c.3(this, paramString, l, paramContext));
        AppMethodBeat.o(18942);
        bool2 = bool1;
        break;
      }
      if (paramArrayOfString.length > 1)
      {
        paramArrayOfString = paramArrayOfString[1];
        label934: l = System.nanoTime();
        paramContext.getString(2131297061);
        paramString = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131302212), false, null);
        i = this.kHL.b(paramArrayOfString, new c.4(this, paramString, l, paramContext));
        if (i != 0)
        {
          if (paramString != null)
            paramString.dismiss();
          switch (i)
          {
          default:
            i = 2131302211;
          case -2:
          case -3:
          }
        }
      }
      while (true)
      {
        Toast.makeText(paramContext, i, 1).show();
        AppMethodBeat.o(18942);
        bool2 = bool1;
        break;
        paramArrayOfString = null;
        break label934;
        i = 2131302214;
        continue;
        i = 2131302213;
      }
      bool2 = b(paramContext, paramArrayOfString);
      AppMethodBeat.o(18942);
      continue;
      bool2 = dA(paramContext);
      AppMethodBeat.o(18942);
      continue;
      bool2 = c(paramContext, paramArrayOfString);
      AppMethodBeat.o(18942);
    }
    if (this.kHM == null)
    {
      this.kHM = new HandlerThread("DBBusyTest", 4);
      this.kHM.start();
      this.kHN = new Handler(this.kHM.getLooper(), new c.7(this));
      this.kHN.sendEmptyMessage(1);
      Toast.makeText(paramContext, "TEST: Begin transaction", 1).show();
    }
    while (true)
    {
      AppMethodBeat.o(18942);
      bool2 = bool1;
      break;
      this.kHN.sendEmptyMessage(2);
      this.kHM.quitSafely();
      this.kHM = null;
      this.kHN = null;
      Toast.makeText(paramContext, "TEST: End transaction", 1).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c
 * JD-Core Version:    0.6.2
 */