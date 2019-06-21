package com.tencent.mm.plugin.nearlife.ui;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.mm.ui.MMActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SelectPoiCategoryUI extends MMActivity
{
  static final String oSN;
  private ListView mListView;
  private MenuItem.OnMenuItemClickListener oSI;
  private SelectPoiCategoryUI.a oSO;
  private ArrayAdapter<String> oSP;
  private List<String> oSQ;
  private AdapterView.OnItemClickListener oSR;

  static
  {
    AppMethodBeat.i(23011);
    oSN = ac.eSj + "poi_categories";
    AppMethodBeat.o(23011);
  }

  public SelectPoiCategoryUI()
  {
    AppMethodBeat.i(23003);
    this.oSR = new SelectPoiCategoryUI.1(this);
    this.oSI = new SelectPoiCategoryUI.2(this);
    AppMethodBeat.o(23003);
  }

  // ERROR //
  private boolean D(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: sipush 23006
    //   3: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnonnull +13 -> 20
    //   10: iconst_0
    //   11: istore_2
    //   12: sipush 23006
    //   15: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: iload_2
    //   19: ireturn
    //   20: aload_0
    //   21: getfield 77	com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI:oSQ	Ljava/util/List;
    //   24: invokeinterface 82 1 0
    //   29: new 84	java/io/BufferedReader
    //   32: astore_3
    //   33: new 86	java/io/InputStreamReader
    //   36: astore 4
    //   38: aload 4
    //   40: aload_1
    //   41: ldc 88
    //   43: invokespecial 91	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   46: aload_3
    //   47: aload 4
    //   49: invokespecial 94	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   52: aload_3
    //   53: astore 4
    //   55: aload_3
    //   56: invokevirtual 97	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnull +85 -> 148
    //   66: aload_3
    //   67: astore 4
    //   69: aload_0
    //   70: getfield 77	com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI:oSQ	Ljava/util/List;
    //   73: aload 5
    //   75: invokeinterface 101 2 0
    //   80: pop
    //   81: goto -29 -> 52
    //   84: astore 5
    //   86: aload_3
    //   87: astore 4
    //   89: new 32	java/lang/StringBuilder
    //   92: astore 6
    //   94: aload_3
    //   95: astore 4
    //   97: aload 6
    //   99: ldc 103
    //   101: invokespecial 106	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   104: aload_3
    //   105: astore 4
    //   107: ldc 108
    //   109: aload 6
    //   111: aload 5
    //   113: invokevirtual 111	java/io/IOException:getMessage	()Ljava/lang/String;
    //   116: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   125: aload_3
    //   126: ifnull +7 -> 133
    //   129: aload_3
    //   130: invokevirtual 120	java/io/BufferedReader:close	()V
    //   133: aload_1
    //   134: invokevirtual 123	java/io/InputStream:close	()V
    //   137: iconst_1
    //   138: istore_2
    //   139: sipush 23006
    //   142: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: goto -127 -> 18
    //   148: aload_3
    //   149: invokevirtual 120	java/io/BufferedReader:close	()V
    //   152: aload_1
    //   153: invokevirtual 123	java/io/InputStream:close	()V
    //   156: goto -19 -> 137
    //   159: astore_1
    //   160: ldc 108
    //   162: new 32	java/lang/StringBuilder
    //   165: dup
    //   166: ldc 125
    //   168: invokespecial 106	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   171: aload_1
    //   172: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   175: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   184: goto -47 -> 137
    //   187: astore_1
    //   188: ldc 108
    //   190: new 32	java/lang/StringBuilder
    //   193: dup
    //   194: ldc 125
    //   196: invokespecial 106	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   199: aload_1
    //   200: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   203: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: goto -75 -> 137
    //   215: astore_3
    //   216: aconst_null
    //   217: astore 4
    //   219: aload 4
    //   221: ifnull +8 -> 229
    //   224: aload 4
    //   226: invokevirtual 120	java/io/BufferedReader:close	()V
    //   229: aload_1
    //   230: invokevirtual 123	java/io/InputStream:close	()V
    //   233: sipush 23006
    //   236: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: aload_3
    //   240: athrow
    //   241: astore_1
    //   242: ldc 108
    //   244: new 32	java/lang/StringBuilder
    //   247: dup
    //   248: ldc 125
    //   250: invokespecial 106	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   253: aload_1
    //   254: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   257: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   263: invokestatic 117	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: goto -33 -> 233
    //   269: astore_3
    //   270: goto -51 -> 219
    //   273: astore 5
    //   275: aconst_null
    //   276: astore_3
    //   277: goto -191 -> 86
    //
    // Exception table:
    //   from	to	target	type
    //   55	61	84	java/io/IOException
    //   69	81	84	java/io/IOException
    //   148	156	159	java/lang/Exception
    //   129	133	187	java/lang/Exception
    //   133	137	187	java/lang/Exception
    //   29	52	215	finally
    //   224	229	241	java/lang/Exception
    //   229	233	241	java/lang/Exception
    //   55	61	269	finally
    //   69	81	269	finally
    //   89	94	269	finally
    //   97	104	269	finally
    //   107	125	269	finally
    //   29	52	273	java/io/IOException
  }

  private boolean TF(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(23007);
    boolean bool2;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(23007);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      File localFile = new File(paramString);
      if (!localFile.exists())
      {
        AppMethodBeat.o(23007);
        bool2 = bool1;
      }
      else
      {
        try
        {
          FileInputStream localFileInputStream = new java/io/FileInputStream;
          localFileInputStream.<init>(localFile);
          bool2 = D(localFileInputStream);
          AppMethodBeat.o(23007);
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          ab.d("MicroMsg.SelectPoiCategoryUI", "update poi categories failed, path:%s, msg:%s", new Object[] { paramString, localFileNotFoundException.getMessage() });
          AppMethodBeat.o(23007);
          bool2 = bool1;
        }
      }
    }
  }

  final void bVr()
  {
    AppMethodBeat.i(23010);
    this.oSP.clear();
    for (int i = 0; i < this.oSQ.size(); i++)
      this.oSP.add(this.oSQ.get(i));
    this.oSP.notifyDataSetChanged();
    AppMethodBeat.o(23010);
  }

  final void bc(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23009);
    paramArrayOfByte = new String(paramArrayOfByte).split("\n");
    this.oSQ.clear();
    for (int i = 0; i < paramArrayOfByte.length; i++)
      this.oSQ.add(paramArrayOfByte[i].trim());
    AppMethodBeat.o(23009);
  }

  public final int getLayoutId()
  {
    return 2130970600;
  }

  public final void initView()
  {
    AppMethodBeat.i(23005);
    setMMTitle(2131301722);
    setBackBtn(this.oSI);
    this.oSP = new ArrayAdapter(this, 2130970365);
    this.mListView = ((ListView)findViewById(2131827329));
    this.mListView.setAdapter(this.oSP);
    this.mListView.setOnItemClickListener(this.oSR);
    AssetManager localAssetManager;
    if (!TF(oSN + "/lastest_poi_categories.dat"))
      localAssetManager = getAssets();
    try
    {
      D(localAssetManager.open("default_poi_categories.dat"));
      bVr();
      AppMethodBeat.o(23005);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.d("MicroMsg.SelectPoiCategoryUI", "open file from assets failed: " + localIOException.getMessage());
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23004);
    super.onCreate(paramBundle);
    this.oSQ = new ArrayList();
    initView();
    this.oSO = new SelectPoiCategoryUI.a(this);
    paramBundle = this.oSO;
    a.xxA.c(paramBundle);
    this.oSO.oST = this;
    paramBundle = new k(17);
    aw.Rg().a(paramBundle, 0);
    AppMethodBeat.o(23004);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(23008);
    super.onDestroy();
    SelectPoiCategoryUI.a locala = this.oSO;
    a.xxA.d(locala);
    AppMethodBeat.o(23008);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI
 * JD-Core Version:    0.6.2
 */