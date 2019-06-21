package com.tencent.mm.pluginsdk.ui.tools;

import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class FileExplorerUI$a extends BaseAdapter
{
  String fUJ;
  private File vuc;
  private File vud;
  private File[] vue;

  private FileExplorerUI$a(FileExplorerUI paramFileExplorerUI)
  {
  }

  private void a(File[] paramArrayOfFile)
  {
    AppMethodBeat.i(105850);
    if ((paramArrayOfFile == null) || (paramArrayOfFile.length == 0))
      AppMethodBeat.o(105850);
    while (true)
    {
      return;
      Object localObject1 = new ArrayList();
      Object localObject2 = new ArrayList();
      int i = paramArrayOfFile.length;
      int j = 0;
      if (j < i)
      {
        File localFile = paramArrayOfFile[j];
        FileExplorerUI.b localb = new FileExplorerUI.b(this.vtZ, (byte)0);
        localb.file = localFile;
        localb.vug = g.vo(localFile.getName()).toUpperCase();
        if (localFile.isDirectory())
          ((List)localObject1).add(localb);
        while (true)
        {
          j++;
          break;
          ((List)localObject2).add(localb);
        }
      }
      Collections.sort((List)localObject1, new FileExplorerUI.a.2(this));
      Collections.sort((List)localObject2, new FileExplorerUI.a.3(this));
      localObject1 = ((List)localObject1).iterator();
      for (j = 0; ((Iterator)localObject1).hasNext(); j++)
        paramArrayOfFile[j] = ((FileExplorerUI.b)((Iterator)localObject1).next()).file;
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramArrayOfFile[j] = ((FileExplorerUI.b)((Iterator)localObject2).next()).file;
        j++;
      }
      AppMethodBeat.o(105850);
    }
  }

  public final void g(File paramFile1, File paramFile2)
  {
    AppMethodBeat.i(105847);
    this.vuc = paramFile1;
    if (paramFile2.getAbsolutePath().equalsIgnoreCase(this.fUJ))
      this.vuc = null;
    this.vud = paramFile2;
    if ((this.vud.canRead()) && (this.vud.isDirectory()))
    {
      this.vue = this.vud.listFiles(new FileExplorerUI.a.1(this));
      if (this.vue == null)
        this.vue = new File[0];
      if (this.vue.length <= 0)
        break label118;
      a(this.vue);
      AppMethodBeat.o(105847);
    }
    while (true)
    {
      return;
      this.vue = new File[0];
      label118: AppMethodBeat.o(105847);
    }
  }

  public final int getCount()
  {
    int i = 0;
    int j = 0;
    if (this.vue == null)
      i = j;
    while (true)
    {
      return i;
      j = this.vue.length;
      if (this.vuc != null)
        i = 1;
      i += j;
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(105848);
    if ((this.vuc != null) && (paramInt == 0))
    {
      localObject = this.vuc;
      AppMethodBeat.o(105848);
      return localObject;
    }
    ab.d("FileExplorer", "pos:" + paramInt + ", subFile length:" + this.vue.length);
    Object localObject = this.vue;
    if (this.vuc == null);
    while (true)
    {
      localObject = localObject[paramInt];
      AppMethodBeat.o(105848);
      break;
      paramInt--;
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105849);
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.vtZ, 2130970016, null);
      paramView = new FileExplorerUI.c(this.vtZ, (byte)0);
      paramView.iqT = ((ImageView)paramViewGroup.findViewById(2131825695));
      paramView.gxi = ((TextView)paramViewGroup.findViewById(2131823901));
      paramView.vuh = ((TextView)paramViewGroup.findViewById(2131825707));
      paramViewGroup.setTag(paramView);
    }
    Object localObject = (FileExplorerUI.c)paramViewGroup.getTag();
    paramView = (File)getItem(paramInt);
    if (paramView == this.vuc)
    {
      ((FileExplorerUI.c)localObject).gxi.setText(paramView.getName());
      ((FileExplorerUI.c)localObject).iqT.setImageResource(2130839897);
      ((FileExplorerUI.c)localObject).vuh.setVisibility(0);
      AppMethodBeat.o(105849);
      return paramViewGroup;
    }
    ((FileExplorerUI.c)localObject).iqT.setImageResource(FileExplorerUI.X(paramView));
    ((FileExplorerUI.c)localObject).gxi.setText(paramView.getName());
    localObject = ((FileExplorerUI.c)localObject).vuh;
    StringBuilder localStringBuilder = new StringBuilder().append(DateFormat.format("yyyy-MM-dd hh:mm:ss", paramView.lastModified()).toString());
    if (paramView.isDirectory());
    for (paramView = ""; ; paramView = "  " + bo.ga(paramView.length()))
    {
      ((TextView)localObject).setText(paramView);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI.a
 * JD-Core Version:    0.6.2
 */