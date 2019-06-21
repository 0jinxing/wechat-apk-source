package com.tencent.mm.pluginsdk.ui.tools;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class NewFileExplorerUI$a extends BaseAdapter
{
  private File vud;
  File[] vue;
  private File vvb;
  private boolean vvc;
  private ArrayList<File> vvd;

  public NewFileExplorerUI$a(NewFileExplorerUI paramNewFileExplorerUI)
  {
    AppMethodBeat.i(28186);
    this.vue = new File[0];
    this.vvc = false;
    this.vvd = new ArrayList();
    AppMethodBeat.o(28186);
  }

  private void a(File[] paramArrayOfFile)
  {
    AppMethodBeat.i(28193);
    if ((paramArrayOfFile == null) || (paramArrayOfFile.length == 0))
      AppMethodBeat.o(28193);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      Object localObject1 = new ArrayList();
      int i = paramArrayOfFile.length;
      int j = 0;
      if (j < i)
      {
        localObject2 = paramArrayOfFile[j];
        NewFileExplorerUI.a.a locala = new NewFileExplorerUI.a.a(this, (byte)0);
        locala.file = ((File)localObject2);
        locala.time = ((File)localObject2).lastModified();
        if (((File)localObject2).isDirectory())
        {
          locala.vvf = g.vo(((File)localObject2).getName()).toUpperCase();
          localArrayList.add(locala);
        }
        while (true)
        {
          j++;
          break;
          ((List)localObject1).add(locala);
        }
      }
      Collections.sort(localArrayList, new NewFileExplorerUI.a.2(this));
      Collections.sort((List)localObject1, new NewFileExplorerUI.a.3(this));
      Object localObject2 = localArrayList.iterator();
      for (j = 0; ((Iterator)localObject2).hasNext(); j++)
        paramArrayOfFile[j] = ((NewFileExplorerUI.a.a)((Iterator)localObject2).next()).file;
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramArrayOfFile[j] = ((NewFileExplorerUI.a.a)((Iterator)localObject1).next()).file;
        j++;
      }
      AppMethodBeat.o(28193);
    }
  }

  private static boolean aH(String paramString)
  {
    AppMethodBeat.i(28197);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".mp3")) || (paramString.endsWith(".wma")))
    {
      bool = true;
      AppMethodBeat.o(28197);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28197);
    }
  }

  static boolean aI(String paramString)
  {
    AppMethodBeat.i(28198);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".mp4")) || (paramString.endsWith(".rm")))
    {
      bool = true;
      AppMethodBeat.o(28198);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28198);
    }
  }

  private static int ajW(String paramString)
  {
    AppMethodBeat.i(28195);
    paramString = paramString.toLowerCase();
    int i;
    if (akb(paramString))
    {
      i = 2131230821;
      AppMethodBeat.o(28195);
    }
    while (true)
    {
      return i;
      if (ajX(paramString))
      {
        i = 2130837705;
        AppMethodBeat.o(28195);
      }
      else if (aka(paramString))
      {
        i = 2131230809;
        AppMethodBeat.o(28195);
      }
      else if (akf(paramString))
      {
        i = 2131230812;
        AppMethodBeat.o(28195);
      }
      else if (akc(paramString))
      {
        i = 2131230804;
        AppMethodBeat.o(28195);
      }
      else if (akd(paramString))
      {
        i = 2131230807;
        AppMethodBeat.o(28195);
      }
      else if (ake(paramString))
      {
        i = 2131230793;
        AppMethodBeat.o(28195);
      }
      else if (aH(paramString))
      {
        i = 2131230800;
        AppMethodBeat.o(28195);
      }
      else if (aI(paramString))
      {
        i = 2131230817;
        AppMethodBeat.o(28195);
      }
      else if (akh(paramString))
      {
        i = 2131230820;
        AppMethodBeat.o(28195);
      }
      else if (akg(paramString))
      {
        i = 2131230797;
        AppMethodBeat.o(28195);
      }
      else if (isNumber(paramString))
      {
        i = 2131230802;
        AppMethodBeat.o(28195);
      }
      else if (aki(paramString))
      {
        i = 2131230803;
        AppMethodBeat.o(28195);
      }
      else
      {
        i = 2131230813;
        AppMethodBeat.o(28195);
      }
    }
  }

  private static boolean ajX(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(28196);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    if ((Build.VERSION.SDK_INT >= 28) && (paramString.endsWith(".heic")))
      AppMethodBeat.o(28196);
    while (true)
    {
      return bool;
      if ((paramString.endsWith(".bmp")) || (paramString.endsWith(".png")) || (paramString.endsWith(".jpg")) || (paramString.endsWith(".jpeg")) || (paramString.endsWith(".gif")))
      {
        AppMethodBeat.o(28196);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(28196);
      }
    }
  }

  private static boolean aka(String paramString)
  {
    AppMethodBeat.i(28199);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".rar")) || (paramString.endsWith(".zip")) || (paramString.endsWith(".7z")) || (paramString.endsWith("tar")) || (paramString.endsWith(".iso")))
    {
      bool = true;
      AppMethodBeat.o(28199);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28199);
    }
  }

  private static boolean akb(String paramString)
  {
    AppMethodBeat.i(28200);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".doc")) || (paramString.endsWith(".docx")) || (paramString.endsWith("wps")))
    {
      bool = true;
      AppMethodBeat.o(28200);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28200);
    }
  }

  private static boolean akc(String paramString)
  {
    AppMethodBeat.i(28201);
    boolean bool = bo.nullAsNil(paramString).toLowerCase().endsWith(".pdf");
    AppMethodBeat.o(28201);
    return bool;
  }

  private static boolean akd(String paramString)
  {
    AppMethodBeat.i(28202);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".ppt")) || (paramString.endsWith(".pptx")))
    {
      bool = true;
      AppMethodBeat.o(28202);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28202);
    }
  }

  private static boolean ake(String paramString)
  {
    AppMethodBeat.i(28203);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".xls")) || (paramString.endsWith(".xlsx")))
    {
      bool = true;
      AppMethodBeat.o(28203);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28203);
    }
  }

  private static boolean akf(String paramString)
  {
    AppMethodBeat.i(28204);
    paramString = bo.nullAsNil(paramString).toLowerCase();
    boolean bool;
    if ((paramString.endsWith(".txt")) || (paramString.endsWith(".rtf")))
    {
      bool = true;
      AppMethodBeat.o(28204);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28204);
    }
  }

  private static boolean akg(String paramString)
  {
    AppMethodBeat.i(28205);
    boolean bool = bo.nullAsNil(paramString).toLowerCase().endsWith(".key");
    AppMethodBeat.o(28205);
    return bool;
  }

  private static boolean akh(String paramString)
  {
    AppMethodBeat.i(28206);
    boolean bool = bo.nullAsNil(paramString).toLowerCase().endsWith(".html");
    AppMethodBeat.o(28206);
    return bool;
  }

  private static boolean aki(String paramString)
  {
    AppMethodBeat.i(28208);
    boolean bool = bo.nullAsNil(paramString).toLowerCase().endsWith(".pages");
    AppMethodBeat.o(28208);
    return bool;
  }

  private static boolean isNumber(String paramString)
  {
    AppMethodBeat.i(28207);
    boolean bool = bo.nullAsNil(paramString).toLowerCase().endsWith(".number");
    AppMethodBeat.o(28207);
    return bool;
  }

  public final void a(File paramFile, List<String> paramList)
  {
    AppMethodBeat.i(28187);
    this.vud = paramFile;
    if ((this.vud != null) && (this.vud.canRead()) && (this.vud.isDirectory()))
    {
      this.vue = this.vud.listFiles(new NewFileExplorerUI.a.1(this));
      if (this.vue == null)
        this.vue = new File[0];
      if (this.vue.length <= 0)
        break label167;
      a(this.vue);
      AppMethodBeat.o(28187);
    }
    while (true)
    {
      return;
      if (paramList != null)
      {
        this.vue = new File[paramList.size()];
        for (int i = 0; i < paramList.size(); i++)
        {
          this.vue[i] = new File((String)paramList.get(i));
          this.vvd.add(this.vue[i]);
        }
      }
      label167: AppMethodBeat.o(28187);
    }
  }

  public final void c(File paramFile, boolean paramBoolean)
  {
    this.vvb = paramFile;
    this.vvc = paramBoolean;
  }

  public final int cdf()
  {
    AppMethodBeat.i(28188);
    Iterator localIterator = this.vvd.iterator();
    File localFile;
    long l;
    for (int i = 0; localIterator.hasNext(); i = (int)(localFile.length() + l))
    {
      localFile = (File)localIterator.next();
      l = i;
    }
    AppMethodBeat.o(28188);
    return i;
  }

  public final ArrayList<String> dlu()
  {
    AppMethodBeat.i(28189);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.vvd.iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      if ((!ajX(localFile.getName())) && (!aI(localFile.getName())))
        localArrayList.add(localFile.getPath());
    }
    AppMethodBeat.o(28189);
    return localArrayList;
  }

  public final ArrayList<String> dlv()
  {
    AppMethodBeat.i(28190);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.vvd.iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      if (ajX(localFile.getName()))
        localArrayList.add(localFile.getPath());
    }
    AppMethodBeat.o(28190);
    return localArrayList;
  }

  public final ArrayList<String> dlw()
  {
    AppMethodBeat.i(28191);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.vvd.iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      if (aI(localFile.getName()))
        localArrayList.add(localFile.getPath());
    }
    AppMethodBeat.o(28191);
    return localArrayList;
  }

  public final File dlx()
  {
    AppMethodBeat.i(28192);
    File localFile;
    if (this.vud.hashCode() == this.vvb.hashCode())
    {
      localFile = null;
      AppMethodBeat.o(28192);
    }
    while (true)
    {
      return localFile;
      localFile = this.vud.getParentFile();
      AppMethodBeat.o(28192);
    }
  }

  public final int getCount()
  {
    return this.vue.length;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = null;
    AppMethodBeat.i(28194);
    View localView = paramView;
    if (paramView == null)
    {
      localView = View.inflate(paramViewGroup.getContext(), 2130969570, null);
      paramView = new NewFileExplorerUI.a.b(this, (byte)0);
      paramView.vvg = ((FrameLayout)localView.findViewById(2131824073));
      paramView.vvh = ((CheckBox)paramView.vvg.findViewById(2131824075));
      paramView.iqT = ((ImageView)localView.findViewById(2131823474));
      paramView.gnB = ((TextView)localView.findViewById(2131823564));
      paramView.pxy = ((TextView)localView.findViewById(2131823324));
      paramView.enf = ((TextView)localView.findViewById(2131824074));
      paramView.vvg.setOnClickListener(new NewFileExplorerUI.a.4(this));
      localView.setTag(paramView);
    }
    paramViewGroup = (NewFileExplorerUI.a.b)localView.getTag();
    File localFile = this.vue[paramInt];
    paramViewGroup.gnB.setText(localFile.getName());
    int i;
    if (localFile.isDirectory())
    {
      paramViewGroup.iqT.setImageResource(2131230796);
      paramViewGroup.vvg.setVisibility(4);
      paramViewGroup.pxy.setVisibility(0);
      paramViewGroup.enf.setVisibility(8);
      paramView = localFile.list(new NewFileExplorerUI.a.5(this));
      if (paramView != null)
      {
        i = paramView.length;
        paramViewGroup.pxy.setText(this.vva.getString(2131299783, new Object[] { Integer.valueOf(i) }));
      }
    }
    while (true)
    {
      paramViewGroup.vvh.setChecked(this.vvd.contains(localFile));
      paramViewGroup.vvg.setTag(Integer.valueOf(paramInt));
      AppMethodBeat.o(28194);
      return localView;
      i = 0;
      break;
      paramViewGroup.vvg.setVisibility(0);
      paramViewGroup.pxy.setVisibility(0);
      paramViewGroup.enf.setVisibility(0);
      paramViewGroup.pxy.setText(bo.ga(localFile.length()));
      paramViewGroup.enf.setText(h.c(this.vva, localFile.lastModified(), true));
      if (ajX(localFile.getName()))
      {
        paramView = localFile.getPath();
        Cursor localCursor = this.vva.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] { "_id" }, "_data=?", new String[] { paramView }, null);
        paramView = localObject;
        if (localCursor != null)
        {
          if (!localCursor.moveToFirst())
            break label505;
          i = localCursor.getInt(localCursor.getColumnIndex("_id"));
          localCursor.close();
        }
        for (paramView = MediaStore.Images.Thumbnails.getThumbnail(this.vva.getContentResolver(), i, 3, null); ; paramView = localObject)
        {
          if (paramView == null)
            break label518;
          paramViewGroup.iqT.setImageBitmap(paramView);
          break;
          label505: localCursor.close();
        }
        label518: paramViewGroup.iqT.setImageResource(ajW(localFile.getName()));
      }
      else
      {
        paramViewGroup.iqT.setImageResource(ajW(localFile.getName()));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI.a
 * JD-Core Version:    0.6.2
 */