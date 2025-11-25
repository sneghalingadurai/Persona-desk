import { Component, OnInit } from '@angular/core';

interface CardData {
  cardName: string;
}

@Component({
  selector: 'app-home-dashboard',
  templateUrl: './home-dashboard.component.html',
  styleUrls: ['./home-dashboard.component.scss']
})
export class HomeDashboardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  cards: CardData[] = [
    { cardName: 'Jobs' },
    { cardName: 'Notes' },
    { cardName: 'Files' },
    { cardName: 'Reminders' },
    { cardName: 'Reports' }
    // Add more card data as needed
  ]

  openCard(card: any) {
  console.log("Card clicked:", card);
}


}
