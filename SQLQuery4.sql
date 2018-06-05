USE [merchant]
GO

/****** Object:  Table [dbo].[custom_table2]    Script Date: 6/5/2018 11:38:10 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[custom_table2](
	[key_1] [varchar](50) NOT NULL,
	[key_2] [datetime] NOT NULL,
	[data_int] [int] NOT NULL,
	[data_string] [varchar](50) NOT NULL,
 CONSTRAINT [PK_custom_table2] PRIMARY KEY CLUSTERED 
(
	[key_1] ASC,
	[key_2] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


