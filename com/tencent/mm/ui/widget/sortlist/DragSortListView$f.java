package com.tencent.mm.ui.widget.sortlist;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import java.io.File;
import java.io.IOException;

final class DragSortListView$f
{
  File gUc;
  StringBuilder mBuilder;
  int zVM;
  int zVN;
  boolean zVO;

  DragSortListView$f(DragSortListView paramDragSortListView)
  {
    AppMethodBeat.i(113044);
    this.mBuilder = new StringBuilder();
    this.zVM = 0;
    this.zVN = 0;
    this.zVO = false;
    this.gUc = new File(Environment.getExternalStorageDirectory(), "dslv_state.txt");
    if (!this.gUc.exists());
    while (true)
    {
      try
      {
        if (!this.gUc.createNewFile())
          ai.e("mobeta", "creat file fail!! file already exist", new Object[0]);
        ai.d("mobeta", "file created", new Object[0]);
        AppMethodBeat.o(113044);
        return;
      }
      catch (IOException paramDragSortListView)
      {
        ai.w("mobeta", "Could not create dslv_state.txt", new Object[0]);
        ai.d("mobeta", paramDragSortListView.getMessage(), new Object[0]);
      }
      AppMethodBeat.o(113044);
    }
  }

  // ERROR //
  public final void flush()
  {
    // Byte code:
    //   0: ldc 97
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 45	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:zVO	Z
    //   9: ifne +9 -> 18
    //   12: ldc 97
    //   14: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   17: return
    //   18: aload_0
    //   19: getfield 43	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:zVN	I
    //   22: ifne +208 -> 230
    //   25: iconst_0
    //   26: istore_1
    //   27: new 99	java/io/BufferedWriter
    //   30: astore_2
    //   31: new 101	java/io/OutputStreamWriter
    //   34: astore_3
    //   35: new 103	java/io/FileOutputStream
    //   38: astore 4
    //   40: aload 4
    //   42: aload_0
    //   43: getfield 60	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:gUc	Ljava/io/File;
    //   46: iload_1
    //   47: invokespecial 106	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   50: aload_3
    //   51: aload 4
    //   53: ldc 108
    //   55: invokespecial 111	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   58: aload_2
    //   59: aload_3
    //   60: invokespecial 114	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   63: aload_2
    //   64: aload_0
    //   65: getfield 39	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:mBuilder	Ljava/lang/StringBuilder;
    //   68: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokevirtual 123	java/io/Writer:write	(Ljava/lang/String;)V
    //   74: aload_0
    //   75: getfield 39	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:mBuilder	Ljava/lang/StringBuilder;
    //   78: iconst_0
    //   79: aload_0
    //   80: getfield 39	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:mBuilder	Ljava/lang/StringBuilder;
    //   83: invokevirtual 127	java/lang/StringBuilder:length	()I
    //   86: invokevirtual 131	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_2
    //   91: invokevirtual 133	java/io/Writer:flush	()V
    //   94: aload_0
    //   95: aload_0
    //   96: getfield 43	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:zVN	I
    //   99: iconst_1
    //   100: iadd
    //   101: putfield 43	com/tencent/mm/ui/widget/sortlist/DragSortListView$f:zVN	I
    //   104: aload_2
    //   105: invokevirtual 136	java/io/Writer:close	()V
    //   108: ldc 97
    //   110: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: goto -96 -> 17
    //   116: astore_2
    //   117: ldc 138
    //   119: aload_2
    //   120: ldc 140
    //   122: iconst_0
    //   123: anewarray 4	java/lang/Object
    //   126: invokestatic 144	com/tencent/mm/ui/ai:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: ldc 97
    //   131: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   134: goto -117 -> 17
    //   137: astore_2
    //   138: aconst_null
    //   139: astore_2
    //   140: aload_2
    //   141: ifnull +7 -> 148
    //   144: aload_2
    //   145: invokevirtual 136	java/io/Writer:close	()V
    //   148: ldc 97
    //   150: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: goto -136 -> 17
    //   156: astore_2
    //   157: ldc 138
    //   159: aload_2
    //   160: ldc 140
    //   162: iconst_0
    //   163: anewarray 4	java/lang/Object
    //   166: invokestatic 144	com/tencent/mm/ui/ai:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: ldc 97
    //   171: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: goto -157 -> 17
    //   177: astore_2
    //   178: aconst_null
    //   179: astore 4
    //   181: aload 4
    //   183: ifnull +8 -> 191
    //   186: aload 4
    //   188: invokevirtual 136	java/io/Writer:close	()V
    //   191: ldc 97
    //   193: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: aload_2
    //   197: athrow
    //   198: astore 4
    //   200: ldc 138
    //   202: aload 4
    //   204: ldc 140
    //   206: iconst_0
    //   207: anewarray 4	java/lang/Object
    //   210: invokestatic 144	com/tencent/mm/ui/ai:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   213: goto -22 -> 191
    //   216: astore_3
    //   217: aload_2
    //   218: astore 4
    //   220: aload_3
    //   221: astore_2
    //   222: goto -41 -> 181
    //   225: astore 4
    //   227: goto -87 -> 140
    //   230: iconst_1
    //   231: istore_1
    //   232: goto -205 -> 27
    //
    // Exception table:
    //   from	to	target	type
    //   104	108	116	java/io/IOException
    //   18	25	137	java/io/IOException
    //   27	63	137	java/io/IOException
    //   144	148	156	java/io/IOException
    //   18	25	177	finally
    //   27	63	177	finally
    //   186	191	198	java/io/IOException
    //   63	104	216	finally
    //   63	104	225	java/io/IOException
  }

  public final void stopTracking()
  {
    AppMethodBeat.i(113046);
    if (this.zVO)
    {
      this.mBuilder.append("</DSLVStates>\n");
      flush();
      this.zVO = false;
    }
    AppMethodBeat.o(113046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView.f
 * JD-Core Version:    0.6.2
 */