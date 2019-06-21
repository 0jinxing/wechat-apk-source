package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import java.io.File;
import java.util.Comparator;

public class FileExplorerUI extends MMActivity
{
  private int vtO = 0;
  private ListView vtP;
  private FileExplorerUI.a vtQ;
  private TextView vtR;
  private TextView vtS;
  private View vtT;
  private View vtU;
  private String vtV;
  private String vtW;
  private File vtX;
  private File vtY;

  private void Lr(int paramInt)
  {
    AppMethodBeat.i(105857);
    if (1 == paramInt)
    {
      this.vtO = 1;
      this.vtS.setTextColor(getResources().getColor(2131690135));
      this.vtR.setTextColor(getResources().getColor(2131690316));
      this.vtT.setVisibility(4);
      this.vtU.setVisibility(0);
      AppMethodBeat.o(105857);
    }
    while (true)
    {
      return;
      this.vtO = 0;
      this.vtR.setTextColor(getResources().getColor(2131690135));
      this.vtS.setTextColor(getResources().getColor(2131690316));
      this.vtT.setVisibility(0);
      this.vtU.setVisibility(4);
      AppMethodBeat.o(105857);
    }
  }

  private static File V(File paramFile)
  {
    AppMethodBeat.i(105860);
    z localz = g.RP().Ry();
    Object localObject;
    if (paramFile == null)
    {
      localObject = null;
      localObject = (String)localz.get(131073, localObject);
      if ((localObject == null) || (paramFile == null) || (paramFile.getAbsolutePath().equals(localObject)))
        break label81;
      localObject = new File((String)localObject);
      if (!((File)localObject).exists())
        break label81;
      AppMethodBeat.o(105860);
      paramFile = (File)localObject;
    }
    while (true)
    {
      return paramFile;
      localObject = paramFile.getAbsolutePath();
      break;
      label81: AppMethodBeat.o(105860);
    }
  }

  private static File W(File paramFile)
  {
    AppMethodBeat.i(105861);
    z localz = g.RP().Ry();
    Object localObject;
    if (paramFile == null)
    {
      localObject = null;
      localObject = (String)localz.get(131074, localObject);
      if ((localObject == null) || (paramFile == null) || (paramFile.getAbsolutePath().equals(localObject)))
        break label81;
      localObject = new File((String)localObject);
      if (!((File)localObject).exists())
        break label81;
      AppMethodBeat.o(105861);
      paramFile = (File)localObject;
    }
    while (true)
    {
      return paramFile;
      localObject = paramFile.getAbsolutePath();
      break;
      label81: AppMethodBeat.o(105861);
    }
  }

  public static int ajW(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(105862);
    paramString = paramString.toLowerCase();
    String str = bo.nullAsNil(paramString).toLowerCase();
    int j;
    if ((str.endsWith(".doc")) || (str.endsWith(".docx")) || (str.endsWith("wps")))
    {
      j = 1;
      if (j == 0)
        break label68;
      j = 2131230821;
      AppMethodBeat.o(105862);
    }
    label161: 
    while (true)
    {
      return j;
      j = 0;
      break;
      label68: if (ajX(paramString))
      {
        j = 2130839899;
        AppMethodBeat.o(105862);
      }
      else
      {
        str = bo.nullAsNil(paramString).toLowerCase();
        if ((str.endsWith(".rar")) || (str.endsWith(".zip")) || (str.endsWith(".7z")) || (str.endsWith("tar")) || (str.endsWith(".iso")));
        for (j = 1; ; j = 0)
        {
          if (j == 0)
            break label161;
          j = 2131230809;
          AppMethodBeat.o(105862);
          break;
        }
        str = bo.nullAsNil(paramString).toLowerCase();
        if ((str.endsWith(".txt")) || (str.endsWith(".rtf")));
        for (j = 1; ; j = 0)
        {
          if (j == 0)
            break label209;
          j = 2131230812;
          AppMethodBeat.o(105862);
          break;
        }
        label209: if (bo.nullAsNil(paramString).toLowerCase().endsWith(".pdf"))
        {
          j = 2131230804;
          AppMethodBeat.o(105862);
        }
        else
        {
          str = bo.nullAsNil(paramString).toLowerCase();
          if ((str.endsWith(".ppt")) || (str.endsWith(".pptx")));
          for (j = 1; ; j = 0)
          {
            if (j == 0)
              break label283;
            j = 2131230807;
            AppMethodBeat.o(105862);
            break;
          }
          paramString = bo.nullAsNil(paramString).toLowerCase();
          if (!paramString.endsWith(".xls"))
          {
            j = i;
            if (!paramString.endsWith(".xlsx"));
          }
          else
          {
            j = 1;
          }
          if (j != 0)
          {
            j = 2131230793;
            AppMethodBeat.o(105862);
          }
          else
          {
            j = 2131230813;
            AppMethodBeat.o(105862);
          }
        }
      }
    }
  }

  public static boolean ajX(String paramString)
  {
    AppMethodBeat.i(105863);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".bmp")) || (paramString.endsWith(".png")) || (paramString.endsWith(".jpg")) || (paramString.endsWith(".jpeg")) || (paramString.endsWith(".gif")))
    {
      bool = true;
      AppMethodBeat.o(105863);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105863);
    }
  }

  public static boolean ajY(String paramString)
  {
    AppMethodBeat.i(105864);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".mp3")) || (paramString.endsWith(".wma")) || (paramString.endsWith(".mp4")) || (paramString.endsWith(".rm")))
    {
      bool = true;
      AppMethodBeat.o(105864);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105864);
    }
  }

  private File dlm()
  {
    AppMethodBeat.i(105858);
    File localFile = h.getRootDirectory();
    if (localFile.canRead())
      AppMethodBeat.o(105858);
    while (true)
    {
      return localFile;
      localFile = h.getDataDirectory();
      if (localFile.canRead())
      {
        this.vtV = localFile.getName();
        AppMethodBeat.o(105858);
      }
      else
      {
        localFile = null;
        AppMethodBeat.o(105858);
      }
    }
  }

  private File dln()
  {
    AppMethodBeat.i(105859);
    File localFile;
    if (g.RP().isSDCardAvailable())
    {
      localFile = h.getExternalStorageDirectory();
      AppMethodBeat.o(105859);
    }
    while (true)
    {
      return localFile;
      localFile = h.getDownloadCacheDirectory();
      if (localFile.canRead())
      {
        this.vtW = localFile.getName();
        AppMethodBeat.o(105859);
      }
      else
      {
        localFile = null;
        AppMethodBeat.o(105859);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970015;
  }

  public final void initView()
  {
    boolean bool1 = true;
    AppMethodBeat.i(105856);
    this.vtP = ((ListView)findViewById(2131825706));
    this.vtR = ((TextView)findViewById(2131825702));
    this.vtT = findViewById(2131825703);
    this.vtS = ((TextView)findViewById(2131825704));
    this.vtU = findViewById(2131825705);
    setBackBtn(new FileExplorerUI.1(this));
    this.vtV = getString(2131301991);
    this.vtW = getString(2131301992);
    File localFile1 = dlm();
    final File localFile2 = dln();
    this.vtX = V(localFile1);
    this.vtY = W(localFile2);
    this.vtQ = new FileExplorerUI.a(this, (byte)0);
    TextView localTextView;
    if (localFile2 != null)
    {
      Lr(1);
      this.vtQ.fUJ = localFile2.getPath();
      this.vtQ.g(this.vtY.getParentFile(), this.vtY);
      localTextView = this.vtR;
      if (localFile1 == null)
        break label354;
      bool2 = true;
      label196: localTextView.setEnabled(bool2);
      localTextView = this.vtS;
      if (localFile2 == null)
        break label360;
    }
    label354: label360: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localTextView.setEnabled(bool2);
      this.vtP.setAdapter(this.vtQ);
      this.vtQ.notifyDataSetChanged();
      this.vtP.setOnItemClickListener(new FileExplorerUI.2(this));
      this.vtR.setOnClickListener(new FileExplorerUI.3(this, localFile1));
      this.vtS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(105843);
          FileExplorerUI.a(FileExplorerUI.this, 1);
          FileExplorerUI.a(FileExplorerUI.this).fUJ = localFile2.getPath();
          FileExplorerUI.a(FileExplorerUI.this).g(FileExplorerUI.d(FileExplorerUI.this).getParentFile(), FileExplorerUI.d(FileExplorerUI.this));
          FileExplorerUI.a(FileExplorerUI.this).notifyDataSetInvalidated();
          FileExplorerUI.a(FileExplorerUI.this).notifyDataSetChanged();
          FileExplorerUI.c(FileExplorerUI.this).setSelection(0);
          AppMethodBeat.o(105843);
        }
      });
      AppMethodBeat.o(105856);
      while (true)
      {
        return;
        if (localFile1 != null)
        {
          Lr(0);
          this.vtQ.fUJ = localFile1.getPath();
          this.vtQ.g(this.vtX.getParentFile(), this.vtX);
          break;
        }
        ab.d("MicroMsg.FileExplorerUI", "left and right tag disabled in the same time.");
        AppMethodBeat.o(105856);
      }
      bool2 = false;
      break label196;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(105851);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_title");
    if (bo.isNullOrNil(paramBundle))
      setMMTitle(2131301993);
    while (true)
    {
      initView();
      AppMethodBeat.o(105851);
      return;
      setMMTitle(paramBundle);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(105854);
    super.onDestroy();
    AppMethodBeat.o(105854);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(105855);
    if ((paramInt == 4) && (FileExplorerUI.a.a(this.vtQ) != null))
      if (1 == this.vtO)
      {
        this.vtY = FileExplorerUI.a.a(this.vtQ);
        this.vtQ.g(FileExplorerUI.a.a(this.vtQ).getParentFile(), FileExplorerUI.a.a(this.vtQ));
        this.vtQ.notifyDataSetChanged();
        this.vtP.setSelection(0);
        AppMethodBeat.o(105855);
      }
    while (true)
    {
      return bool;
      if (this.vtO != 0)
        break;
      this.vtX = FileExplorerUI.a.a(this.vtQ);
      break;
      if (this.vtY != null)
        g.RP().Ry().set(131074, this.vtY.getAbsolutePath());
      if (this.vtX != null)
        g.RP().Ry().set(131073, this.vtX.getAbsolutePath());
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(105855);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(105853);
    super.onPause();
    AppMethodBeat.o(105853);
  }

  public void onResume()
  {
    AppMethodBeat.i(105852);
    super.onResume();
    AppMethodBeat.o(105852);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI
 * JD-Core Version:    0.6.2
 */